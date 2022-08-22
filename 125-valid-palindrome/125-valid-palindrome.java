class Solution 
{
    public boolean isPalindrome(String s)
    {
        if(s==null)
        {
            return true;
        }
        s=s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(!alpha(s.charAt(left)))
            {
                left++;
            }
            else if(!alpha(s.charAt(right)))
            {
                right--;
            }
            else if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean alpha(char ch)
    {
        if(ch>='a' && ch<='z' ||ch>='0' && ch<='9')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}