class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0, 1);
        int count=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            int val=sum-k;
            if(map.containsKey(val))
            {
                count=count+map.get(val);
            }
            if(map.containsKey(sum))
            {
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}