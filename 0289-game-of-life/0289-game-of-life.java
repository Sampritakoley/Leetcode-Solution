class Solution {
    public void gameOfLife(int[][] board) {
            ArrayList<HashMap<Integer,Integer>> list=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                HashMap<Integer,Integer> map=findAdjacent(i,j,board);
                list.add(map);
            }
        }
        int k=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                HashMap<Integer,Integer> res=list.get(k++);
                if(board[i][j]==1)
                {
                    if(res.get(1)<2){
                        board[i][j]=0;
                    }
                    if(res.get(1)==2 ||res.get(1)==3){
                       board[i][j]=1;
                    }
                    if(res.get(1)>3)
                    {
                        board[i][j]=0;
                    }
                }else if(board[i][j]==0){
                    if(res.get(1)==3)
                    {
                        board[i][j]=1;
                    }
                }
            }
            System.out.println();
        }
    }
    private static HashMap<Integer,Integer> findAdjacent(int i,int j, int[][] board){
         
       int[] arr=new int[]{-1,-1,-1,0,-1,1,0,-1,0,1,1,-1,1,0,1,1};
       int countZero=0;
       int countOne=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       int x=0;
       while(x<arr.length-1)
       {
           int row=i+arr[x++];
           int col=j+arr[x++];
           if(row ==-1 || col == -1 || row == board.length || col==board[0].length)
           {
              continue;
           }
           int val=board[row][col];
           if(val==0)
           {
              countZero++;
           }
           else if(val==1){
              countOne++;   
           }
       }
       map.put(0, countZero);
       map.put(1,countOne);
       return map;
    }
}