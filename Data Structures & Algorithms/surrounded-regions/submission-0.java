class Solution {
    public void solve(char[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        boolean[][] safe=new boolean[rows][cols];
        for(int c=0;c<cols;c++)
        {
            dfs(0,c,board,safe);
            dfs(rows-1,c,board,safe);
        }
        for(int r=0;r<rows;r++)
        {
            dfs(r,0,board,safe);
            dfs(r,cols-1,board,safe);
        }
        for(int r=0;r<rows;r++)
        {
            for(int c=0;c<cols;c++)
            {
                if(safe[r][c]!=true&&board[r][c]!='X')board[r][c]='X';
            }
        }
    }
    private void dfs(int r,int c,char[][] board,boolean[][] safe)
    {
        if(r>=board.length||r<0||c>=board[0].length||c<0||board[r][c]!='O'||safe[r][c]==true)return;
        safe[r][c]=true;
        dfs(r+1,c,board,safe);
        dfs(r-1,c,board,safe);
        dfs(r,c+1,board,safe);
        dfs(r,c-1,board,safe);
    }
}
