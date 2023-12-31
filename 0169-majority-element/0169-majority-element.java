class Solution {
    public int majorityElement(int[] nums) {
        int[] occurred=new int[nums.length];
        int n=nums.length/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
         {
             if(entry.getValue()>n){
                   return entry.getKey();
             }
         }
         return -1;
    }
}