class Solution 
{
    public boolean exist(char[][] board, String word)
    {
        char ch=word.charAt(0);
        boolean res;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==ch)
                {
                    res=searchword(board,i,j,0,word);
                    if(res)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean searchword(char[][] board,int i,int j,int cnt,String word)
    {
        if(cnt==word.length())
        {
            return true;
        }
        if( i == -1 || i == board.length ||j == -1 || j == board[0].length || 
           board[i][j] != word.charAt(cnt))
        {
             return false;
        }
        char temp=board[i][j];
        board[i][j]='*';
        boolean found=searchword(board,i+1,j,cnt+1,word)||
            searchword(board,i-1,j,cnt+1,word)||
            searchword(board,i,j+1,cnt+1,word)||
            searchword(board,i,j-1,cnt+1,word);
        board[i][j]=temp;
        return found;        
    }
}