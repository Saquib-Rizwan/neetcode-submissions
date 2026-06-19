class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++)
        {
            for(int c=0;c<board[0].length;c++)
            {
                if(backtrack(board,0,r,c,word))return true;
            }
        }
        return false;
    }
    private boolean backtrack(char[][] board,int start,int r,int c,String word)
    {
        if(start==word.length())
        {
            return true;
        }
        if(r>=board.length||r<0||c>=board[0].length||c<0||board[r][c]!=word.charAt(start)||board[r][c]=='#')return false;
        char temp=board[r][c];
        board[r][c]='#';
        boolean result=backtrack(board,start+1,r+1,c,word)||backtrack(board,start+1,r-1,c,word)||backtrack(board,start+1,r,c+1,word)||backtrack(board,start+1,r,c-1,word);
        board[r][c]=temp;
        return result;
    }
        
}
