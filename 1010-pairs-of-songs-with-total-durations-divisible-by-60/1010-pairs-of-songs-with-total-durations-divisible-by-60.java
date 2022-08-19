class Solution 
{
    public int numPairsDivisibleBy60(int[] time) 
    {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<time.length;i++)
        {
            int num=time[i]%60;
            if(num==0)
            {
                cnt=cnt+map.getOrDefault(0,0);
            }
            else
            {
                cnt=cnt+map.getOrDefault(60-num,0);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return cnt;
    }
}