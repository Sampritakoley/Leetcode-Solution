class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        String str="";
        char ch;
        while(columnNumber>0)
        {
            int rem=columnNumber%26;
            if(rem==0)
            {
                 ch='Z';
                str=ch+str;
                columnNumber=(columnNumber/26)-1;
            }
            else
            {
                ch=(char)(64+rem);
                str=ch+str;
                columnNumber=columnNumber/26;
            }  
        }
        return str;
    }
}