class Solution {
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> lt=new ArrayList<Integer>();
        subs(nums,lt,list,0);
        return list;
    }
    public void subs(int[] nums,List<Integer> lt,List<List<Integer>> list,int i)
    {
        if(i==nums.length)
        {
            list.add(new ArrayList<Integer>(lt));
            return;
        }
        int n=nums[i];
        lt.add(n);
        subs(nums,lt,list,i+1);
        lt.remove(lt.size()-1);
        subs(nums,lt,list,i+1);
    }
}