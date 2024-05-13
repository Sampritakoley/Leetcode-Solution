class Solution {
    public int maxSubArray(int[] nums) {
        
        int previousBest=nums[0];
        int best=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int sum=previousBest+nums[i];
            previousBest=sum>nums[i]?sum:nums[i];
            best=best<previousBest?previousBest:best;
        }
        return best;
    }
}