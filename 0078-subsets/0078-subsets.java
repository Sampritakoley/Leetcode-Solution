class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res=findSubsets(nums, 0);
        return res;
    }
    public static List<List<Integer>> findSubsets(int[] nums,int c) 
    {
        if(c==nums.length-1)
        {
            List<List<Integer>> ans=new ArrayList<>();
            ans.add(new ArrayList<>());
            List<Integer> list=new ArrayList<>();
            list.add(nums[c]);
            ans.add(list);
            return ans;
        } 
        c++;
        List<List<Integer>> res=findSubsets(nums, c);
        c--;
        List<List<Integer>> arrkist=new ArrayList<>();
        for(int i=0;i<res.size();i++)
        {
            arrkist.add(res.get(i));
            List<Integer> listadd = new ArrayList<>(res.get(i));
            listadd.add(nums[c]);
            arrkist.add(listadd);
        }
        return arrkist;
    }
}