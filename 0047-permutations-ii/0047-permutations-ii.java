class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         ArrayList<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        HashSet<List<Integer>> set=new HashSet<>();
        findPermutation(arr,list,res,set);
        return res;
    }
    public static void findPermutation(List<Integer> arr, List<Integer> list,ArrayList<List<Integer>> res,HashSet<List<Integer>> set)
    {

        if (arr.size() == 0) {
            if(!set.contains(list)){
                res.add(new ArrayList<>(list));
                set.add(new ArrayList<>(list));
            }
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
    
            findPermutation(rest_arr,list ,res,set);
            list.remove(list.size()-1);
        }

    }
}