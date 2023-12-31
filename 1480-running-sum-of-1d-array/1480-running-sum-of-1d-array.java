class Solution {
    public int[] runningSum(int[] nums) {
        int[] temp=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                temp[j]=nums[i];
            }
            else
            {
                temp[j]=nums[i]+temp[j-1];
            }
            j++;
        }
        return temp;
    }
}