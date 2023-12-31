class Solution {
    public int pivotIndex(int[] nums) {
         int pivotIndex=0;
        boolean flag=false;
         
        for(int i=0;i<nums.length;i++)
        {
            int sum1=0,sum2=0,left=i-1,right=i+1;
        
            while(left>=0 || right<nums.length )
            {
                if(left>=0)
                {
                     sum1=sum1+nums[left];
                     left--;
                }
                if(right<nums.length)
                {
                     sum2=sum2+nums[right];
                     right++;
                }
            }
            if(sum1==sum2)
            {
                pivotIndex=i;
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            return -1;
        }
        return pivotIndex;
    }
}