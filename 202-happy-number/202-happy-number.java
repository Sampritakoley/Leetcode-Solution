class Solution 
{
    public boolean isHappy(int n) 
    {
        HashSet<Integer> st=new HashSet<>();
        while(n!=1)
        {
            if(st.contains(n))
            {
                return false;
            }
            st.add(n);
            int num=findnum(n);
            n=num;
        }
        return true;
    }
    public int findnum(int n)
    {
        int res=0,rem;
        while(n>0)
        {
            rem=n%10;
            res=res+(rem*rem);
            n=n/10;
        }
        return res;
    }
}