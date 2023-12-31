class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int k=nums1.length-1;
        while(i>=0 && j>=0 && m!=0 && n!=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[k]=nums1[i];
                i--;
                k--;
            }
            else if(nums1[i]<nums2[j])
            {
                nums1[k]=nums2[j];
                j--;
                k--;
            }
            else
            {
                nums1[k]=nums1[i];
                i--;
                k--;
                nums1[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(j>=0 && n!=0)
        {
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        while(i>=0 && m!=0)
        {
            nums1[k]=nums1[i];
            i--;
            k--;
        }
    }
}