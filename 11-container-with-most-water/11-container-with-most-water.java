class Solution 
{
    public int maxArea(int[] height) 
    {
        int max=Integer.MIN_VALUE,area,left=0,right=height.length-1,h,b;
        while(left<=right)
        {
            h=Math.min(height[left],height[right]);
            b=right-left;
            area=h*b;
            if(area>max)
            {
                max=area;
            }
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }           
        }
        return max;
    }
}