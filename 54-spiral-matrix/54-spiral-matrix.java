class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int top=0,buttom=matrix.length-1,left=0,right=matrix[0].length-1;
        while(true)
        {
            if(left>right)
            {
                break;
            }
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;
            if(top>buttom)
            {
                break;
            }
            for(int i=top;i<=buttom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;
            if(left>right)
            {
                break;
            }
            for(int i=right;i>=left;i--)
            {
                list.add(matrix[buttom][i]);
            }
            buttom--;
            if(top>buttom)
            {
                break;
            }
            for(int i=buttom;i>=top;i--)
            {
                list.add(matrix[i][left]);
            }
            left++;
        }
        return list;
    }
}