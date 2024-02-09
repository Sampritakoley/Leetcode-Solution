class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            int rem=sum%k;
            rem=rem<0?rem+k:rem+0;
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
                map.put(rem, map.get(rem)+1);
            }else{
                map.put(rem,1);
            }
        }
        return count;
    }
}