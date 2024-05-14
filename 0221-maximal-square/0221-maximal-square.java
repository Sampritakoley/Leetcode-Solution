class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            dp[i][matrix[0].length-1]=matrix[i][matrix[0].length-1]-'0';
            max=matrix[i][matrix[0].length-1]-'0'>max?matrix[i][matrix[0].length-1]-'0':max;
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            dp[matrix.length-1][j]=matrix[matrix.length-1][j]-'0';
            max=matrix[matrix.length-1][j]-'0'>max?matrix[matrix.length-1][j]-'0':max;
        }
        
        for(int i=matrix.length-2;i>=0;i--)
        {
            for(int j=matrix[0].length-2;j>=0;j--){
                if((matrix[i][j] -'0')==1){
                    int minval=Math.min(dp[i+1][j+1], dp[i][j+1]);
                    minval=minval<dp[i+1][j]?minval:dp[i+1][j];
                    dp[i][j]=minval+1;
                }else{
                    dp[i][j]=matrix[i][j]-'0';
                }
                max=dp[i][j]>max?dp[i][j]:max;
            }
        }
        return max*max;
    }
}