class Solution {
    public int removeDuplicates(int[] nums) {
       int length=0;
       for(int i=0;i<=nums.length-2;i++)
       {
           if(nums[i]!=nums[i+1])
           {
              nums[length]=nums[i];
              length++;
           }
       }
       nums[length]=nums[nums.length-1];
       length= length+1;
       int k=length;
       while(k<=nums.length-1)
       {
        nums[k]=0;
        k++;
       }
       return length;
    }
}