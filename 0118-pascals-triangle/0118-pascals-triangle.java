class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> prev=result.get(result.size()-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}