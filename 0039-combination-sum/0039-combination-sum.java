class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        backtrack(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
     private void backtrack(int[] candidates,int start,int target,List<Integer> list, List<List<Integer>> res)
    {
        if(target<0)
        {
            return;
        }
        if(target==0)
        {
            res.add(new ArrayList(list));
        }
        for(int i=start;i<candidates.length;i++)
        {
            list.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],list,res);
            list.remove(list.size()-1);
        }
    }
}