class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        findPermutation(arr,list,res);
        return res;
    }
    public static void findPermutation(List<Integer> arr, List<Integer> list,ArrayList<List<Integer>> res)
    {
         if (arr.size() == 0) {
            res.add(new ArrayList<>(list));
            return;
        } 
        for (int i = 0; i < arr.size(); i++) {
            
            int ch = arr.get(i);
            List<Integer> left=arr.subList(0, i);
            List<Integer> right=arr.subList(i+1,arr.size());
            List<Integer> rest_arr=new ArrayList<>();
            rest_arr.addAll(left);
            rest_arr.addAll(right);
            list.add(ch);
            findPermutation(rest_arr,list ,res);
            int ind=list.indexOf(ch);
            list.remove(ind);
        }

    }
}