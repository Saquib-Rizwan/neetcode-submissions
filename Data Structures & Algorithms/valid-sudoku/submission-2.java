class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                char val=board[r][c];
                if(val=='.')continue;
                if(row[r].contains(val))return false;
                row[r].add(val);
                if(col[c].contains(val))return false;
                col[c].add(val);
                int index=(r/3)*3+c/3;
                if(box[index].contains(val))return false;
                box[index].add(val);

            }
        }
        return true;
    }
}
