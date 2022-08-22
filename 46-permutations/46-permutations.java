class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<Integer>();
        boolean[] visited=new boolean[nums.length];
        permute(list,curr,visited,nums);
        return list;
    }
     public void permute(List<List<Integer>> list,ArrayList<Integer> curr,boolean[] visited,int[] nums)
    {
        if(curr.size()==nums.length)
        {
            list.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==false)
            {
                curr.add(nums[i]);
                visited[i]=true;
                permute(list,curr,visited,nums);
                curr.remove(curr.size()-1);
                visited[i]=false;
            }
        }
     }
}