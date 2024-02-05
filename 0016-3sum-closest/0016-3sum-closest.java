class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        int mindiff=Integer.MAX_VALUE;
        int minSum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target)
                {
                    return sum;
                }
                else if(Math.abs(sum-target)<mindiff)
                {
                    mindiff=Math.abs(sum-target);
                    minSum=sum;
                }
                if(sum>target)
                {
                    right--;
                }else{
                    left++;
                }
            }
        }
        return minSum;
    }
}