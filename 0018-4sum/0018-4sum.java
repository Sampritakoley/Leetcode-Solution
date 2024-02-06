class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       ArrayList<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                int left =j+1;
                int right=nums.length-1;
                while(left<right)
                {
                      long sum=Long.valueOf(nums[i])+Long.valueOf(nums[j])+
                          Long.valueOf(nums[left])+Long.valueOf(nums[right]);
                     if(sum==target)
                     {
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        if(!res.contains(list))
                        {
                            res.add(list);
                        }
                     }
                     if(sum>target)
                     {
                        right--;
                     }else{
                        left++;
                     }
                }
            }
        }
        return res;
    }
}