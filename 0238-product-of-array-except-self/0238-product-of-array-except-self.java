class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] productFromStart=new int[nums.length];
        int[] productFromEnd=new int[nums.length];
        productFromStart[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            productFromStart[i]=nums[i]*productFromStart[i-1];
        }
        productFromEnd[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            productFromEnd[i]=nums[i]*productFromEnd[i+1];
        }
        int[] res=new int[nums.length];
        res[0]=productFromEnd[1];
        for(int i=1;i<nums.length-1;i++)
        {
            res[i]=productFromStart[i-1]*productFromEnd[i+1];
        }
        res[nums.length-1]=productFromStart[nums.length-2];
        return res;
    }
}