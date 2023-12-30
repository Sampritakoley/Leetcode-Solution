class Solution {
    public int maxProfit(int[] prices) {
        int min_so_far=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++)
        {
            min_so_far=prices[i]<min_so_far?prices[i]:min_so_far;
            max_profit=max_profit<prices[i]-min_so_far?prices[i]-min_so_far:max_profit;
        }
        return max_profit;
    }
}