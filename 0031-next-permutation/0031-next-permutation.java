class Solution {
     public void nextPermutation(int[] nums)  {
        int n=nums.length;
        int k=n-2;

        //find k
        for(int i=n-1;i>0;i--)
        {
            if(nums[i]<=nums[i-1])
            {
                k--;
            }
            else{
                break;
            }
        }
        

        //special case when the array is in descending order
        if(k==-1)
        {
            reverse(nums,0,n-1);
            return;
        }
         
        for(int i=n-1;i>k;i--)
        {
            if(nums[i]>nums[k])
            {
                //swap
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                break;
            }
        }
        reverse(nums,k+1,n-1);
        return;
    }

    private static void reverse(int[] nums, int start, int end) {
        int left=start;
        int right=end;
        while(left<right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}