class Solution
{
    public String longestCommonPrefix(String[] strs) 
    {
        String first=strs[0];
        String res="";
        int min=minlen(strs);
        for(int i=0;i<min;i++)
        {
            char ch=first.charAt(i);
            int flag=0;
            for(int j=1;j<strs.length;j++)
            {
                String s=strs[j];
                if(ch!=s.charAt(i))
                {
                    flag++;
                    break;
                }
            }
            if(flag==0)
            {
                res=res+ch;
            }
            else
            {
                break;
            }
        }
        return res;
    }
    public static int minlen(String[] strs)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            String a=strs[i];
            if(a.length()<min)
            {
                min=a.length();
            }
        }
        return min;
    }
}