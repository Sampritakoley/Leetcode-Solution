class Solution {
    public int fib(int n) {
        int new_num=1,old=0,next=old+new_num;
        if(n==0)
        {
            return 0;
        }
        for(int i=2;i<=n;i++)
        {
            next=new_num+old;
            old=new_num;
            new_num=next;
        }
        return next;
    }
}