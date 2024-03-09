class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findcombine(k,n,res,list,0);
        return res;
    }
    public static void findcombine(int size, int k,ArrayList<List<Integer>> res,List<Integer> list,int ind) {
      if(ind>k){
        return;
      }
      if(list.size()==size) {
        res.add(new ArrayList<>(list));
        return;
      }
      ind++;
      list.add(ind);
      findcombine(size,k,res,list,ind);
      list.remove(list.size()-1);
      findcombine(size,k,res,list,ind);
      return;
    }
}