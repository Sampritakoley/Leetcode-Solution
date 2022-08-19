class Solution 
{
    public String addStrings(String num1, String num2)
    {
        int n=num1.length();
        int m=num2.length();
        int i=n-1,j=m-1;
        String s;
        String res="";
        int carry=0,rem,sum;
        while(i>=0 && j>=0)
        {
            sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
            rem=sum%10;
            carry=sum/10;
            res=rem+res;
            i--;
            j--;
        }
        while(i>=0)
        {
            sum=(num1.charAt(i)-'0')+carry;
            rem=sum%10;
            carry=sum/10;
            res=rem+res;
            i--;
        }
        while(j>=0)
        {
            sum=(num2.charAt(j)-'0')+carry;
            rem=sum%10;
            carry=sum/10;
            res=rem+res;
            j--;
        }
        if(carry==1)
        {
            res="1"+res;
        }
        return res;
    }
}