class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findCombination(list, res, target, candidates);
        System.out.println(res);
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0;i<res.size();i++)
        {
            Collections.sort(res.get(i));
            if(!resultSet.contains(res.get(i))){
                 resultSet.add(res.get(i));
            }
        }
        res.clear();
        res.addAll(resultSet);
        return res;
    }
    public static void findCombination(List<Integer> list, List<List<Integer>> res,int totalsum,int[] candidates)
    {
        if(totalsum<0)
        {
            return;
        }
        if(totalsum==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<candidates.length;i++)
        {
            int val=candidates[i];
            list.add(val);
            totalsum=totalsum-val;
            findCombination(list, res, totalsum, candidates);
            totalsum=totalsum+list.get(list.size()-1);
            list.remove(list.size()-1);
        }
        return;
    }
}