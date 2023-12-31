class Solution {
    public void moveZeroes(int[] nums) {
     int k=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<=nums.length-1)
        {
            nums[k]=0;
            k++;
        }
    }
}