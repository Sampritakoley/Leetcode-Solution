class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    findcombinationSum(candidates,target,0,res,list,0);
        return res;
    }
     private static void findcombinationSum(int[] candidates, int target,int i,List<List<Integer>> res, List<Integer> list,int sum) {

       if(i>=candidates.length){
          return;
       }
       if(sum > target)
       {
           return;
       }

       if(sum==target)
       {
          res.add(new ArrayList<>(list));
          return;
       }
       

       list.add(candidates[i]);
       sum=sum+candidates[i];
       findcombinationSum(candidates, target, i, res, list, sum);

       sum=sum-candidates[i];
       i++;
       list.remove(list.size()-1);

       findcombinationSum(candidates, target, i, res, list, sum);

  }
}