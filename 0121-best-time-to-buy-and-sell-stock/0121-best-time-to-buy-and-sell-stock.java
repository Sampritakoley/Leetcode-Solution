class Solution {
    public int maxProfit(int[] prices) {
         int[] sell=new int[prices.length];
         int max=Integer.MIN_VALUE;
         for(int i=sell.length-1;i>=0;i--){
             max=prices[i]>max?prices[i]:max;
             sell[i]=max;
         }
         int maxProfit=-1;
         for(int i=0;i<prices.length;i++){
             int profit=sell[i]-prices[i];
             maxProfit=maxProfit>profit?maxProfit:profit;
         }
         return maxProfit;
    }
}