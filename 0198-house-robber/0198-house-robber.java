class Solution {
    public int rob(int[] nums) {
        int inc=0;
        int exc=0;
        for(int i=0;i<nums.length;i++){
            int prevInc=inc;
            inc=nums[i]+exc;
            exc=Math.max(prevInc,exc);
        }
        return Math.max(inc,exc);
    }
}