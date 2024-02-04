class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
           int left=0,top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        ArrayList<Integer> result=new ArrayList<>();
        while(true)
        {
           if(left>right)
           {
               break;
           }
           for(int i=left;i<=right;i++)
           {
               int val=matrix[top][i];
               result.add(val);
           }
           top++;
           if(top>bottom)
           {
               break;
           }
           for(int i=top;i<=bottom;i++)
           {
               int val=matrix[i][right];
               result.add(val);
           }
           right--;
           if(left>right)
           {
               break;
           }
           for(int i=right;i>=left;i--)
           {
              int val=matrix[bottom][i];
              result.add(val);
           }
           bottom--;
           if(top>bottom)
           {
               break;
           }
           for(int i=bottom;i>=top;i--)
           {
              int val=matrix[i][left];
              result.add(val);
           }
           left++;
        }
        return result;
    }
}