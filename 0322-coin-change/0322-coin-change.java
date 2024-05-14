class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            int min=Integer.MAX_VALUE;
            boolean flag=false;
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    int val=dp[i-coins[j]];;
                    if(val!=-1){
                        flag=true;
                        min=min>val?val:min;
                    }
                }
            }if(flag){
                dp[i]=min+1;
            }else{
                dp[i]=-1;
            }
        }
        return dp[dp.length-1];
    }
}