class Solution {
    public int maxProduct(int[] nums) {
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(left==0){
                left=1;
            }if(right==0){
                right=1;
            }
            left=left*nums[i];
            right=right*nums[nums.length-1-i];
            int maxPro=left>right?left:right;
            max=maxPro>max?maxPro:max;
        }
        return max;
    }
}