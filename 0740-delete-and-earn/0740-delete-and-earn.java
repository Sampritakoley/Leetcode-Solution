class Solution {
    public int deleteAndEarn(int[] nums) {
        int inc=0;
       int exl=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           max=nums[i]>max?nums[i]:max;
       }
       int[] occ=new int[max+1];
       for(int i=0;i<nums.length;i++){
          occ[nums[i]]=occ[nums[i]]+1;
       }

       for(int i=1;i<occ.length;i++){
           int preInc=inc;
           inc=i*occ[i]+exl;
           exl=Math.max(preInc, exl);
       }
       int maxnum=Math.max(exl,inc);
        return maxnum;

    }
}