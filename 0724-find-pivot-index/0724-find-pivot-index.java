class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
          sum=sum+nums[i];
        }
        int leftsum=0,rightsum=sum,left_next=0;
        for(int i=0;i<nums.length;i++)
        {
            leftsum=left_next;
            rightsum=rightsum-nums[i];
            left_next=leftsum+nums[i];
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
    }
}