class Solution 
{
    public double myPow(double x, int n) 
    {
       if(n>=0)
       {
           return positive(x,n);
       }
        else
       {
           return negative(x,n);
       }
    }
    private double positive(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        double ans=myPow(x,n/2);
        if(n%2==0)
        {
            return ans*ans;
        }
        else
        {
            return ans*ans*x;
        }
    }
    private double negative(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        double ans=myPow(x,n/2);
        if(n%2==0)
        {
            return ans*ans;
        }
        else
        {
            return ans*ans*(1/x);
        }
    }
}