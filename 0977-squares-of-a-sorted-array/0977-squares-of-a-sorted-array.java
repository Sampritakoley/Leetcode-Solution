class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int p=nums.length-1;
        while(left<=right)
        {
            if(Math.abs(nums[left])> Math.abs(nums[right]))
            {
                result[p]=nums[left]*nums[left];
                left++;
            }
            else
            {
                result[p]=nums[right]*nums[right];
                right--;
            }
            p--;
        }
        return result;
    }
}