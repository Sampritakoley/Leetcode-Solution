class Solution {
     public static int[] countBits(int n) {
        int[] num=new int[n+1];
        num[0]=0;
         if(n>=1)
        {
        num[1]=1;
        for(int i=2;i<num.length;i++)
        {
            if(i%2!=0)
            {
                int rem=i%2;
                int q=i/2;
                num[i]=num[rem]+num[q*2];
            }else{
                int nearSqrt=nearestPowerOfTwo(i);
                if(nearSqrt==i){
                    num[i]=1;
                }
                else{
                    num[i]=num[nearSqrt]+num[i-nearSqrt];
                }
            }
        }
         }
        return num;
    }
    public static int nearestPowerOfTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return num;
        }
        int lower = (int) Math.pow(2, Math.floor(Math.log(num) / Math.log(2)));
        return lower;
    }
}