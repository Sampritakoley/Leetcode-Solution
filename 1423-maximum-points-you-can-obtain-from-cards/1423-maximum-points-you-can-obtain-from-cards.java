class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] startSum=new int[cardPoints.length];
       int[] endSum=new int[cardPoints.length];
       int lastst=0;
       int lasted=0;
       endSum[endSum.length-1]=cardPoints[cardPoints.length-1];
       startSum[0]=cardPoints[0];
       for(int i=1;i<k;i++)
       {
          startSum[i]=startSum[i-1]+cardPoints[i];
          lastst=i;
       }
       for(int i=cardPoints.length-2;i>=cardPoints.length-k;i--)
       {
          endSum[i]=endSum[i+1]+cardPoints[i];
          lasted=i;
       }
       int max=Math.max(startSum[lastst], endSum[lasted]);
       int left=lastst-1;
       int right=endSum.length-1;
       while(left>=0 && right>lasted){
           int sum=startSum[left]+endSum[right];
           max=Math.max(max, sum);
           left--;
           right--;
       }
       return max;
    }
}