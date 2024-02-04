class Solution {
     public boolean exist(char[][] board, String word) {
        boolean found=false;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char wd=word.charAt(0);
                char bd=board[i][j];
                if(bd==wd)
                {
                    found=findAdjacent(i,j,board,word,0);
                    if(found==true)
                    {
                        break;
                    }
                }
            }
            if(found==true)
            {
                break;
            }
        }
        return found;
    }

    private static boolean findAdjacent(int i,int j,char[][] board,String word,int ch)
    {
        if(ch==word.length())
        {
            return true;
        }
        if(board.length==1 && board[0].length==1 && word.length()==1)
        {
            return true;
        }
        boolean isFound=false;
        if(board[i][j]==word.charAt(ch))
        {
            char temp=board[i][j];
            board[i][j]='$';
            boolean left=false,right=false,up=false,down=false;
            if(i>0)
            {
                left=findAdjacent(i-1,j,board,word,ch+1);
            }
            if(i<board.length-1)
            {
                right=findAdjacent(i+1,j,board,word,ch+1);
            }
            if(j>0)
            {
                up=findAdjacent(i,j-1,board,word,ch+1);
            }
            if(j<board[0].length-1)
            {
                 down=findAdjacent(i,j+1,board,word,ch+1);
            }
            isFound=left||right||up||down;
            board[i][j]=temp;
        }
        return isFound;
    }
}