class Solution {
    public int findDuplicate(int[] nums) {
         int prestore=0;
         int num=0;
         Arrays.sort(nums);
         for(int i=0;i<nums.length-1;i++)
         {
            if(nums[i]==nums[i+1] && nums[i]!=prestore)
            {
                num=nums[i];
                prestore=num;
            }
         }
         return num;
    }
}