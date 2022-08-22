class Solution 
{
    public List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<Integer>();
        combination(list,curr,n,k,0);
        return list;
    }
    public void combination(List<List<Integer>> list,ArrayList<Integer> curr,int n,int k,int i)
    {
        if(i>=n && curr.size()<k)
        {
            return;
        }
        if(curr.size()==k)
        {
            list.add(new ArrayList(curr));
            return;
        }
        curr.add(i+1);
        combination(list,curr,n,k,i+1);
        curr.remove(curr.size()-1);
        combination(list,curr,n,k,i+1);
    }
}