class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxCount=0;
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]==1)
                {
                    maxCount=Math.max(maxCount,dfs(grid,r,c));
                }
            }
        }
        return maxCount;
    }
    private int dfs(int[][] grid,int r,int c)
    {
        if(r>=grid.length||r<0||c<0||c>=grid[0].length||grid[r][c]==0)return 0;
        grid[r][c]=0;
        int n1=dfs(grid,r+1,c);
        int n2=dfs(grid,r-1,c);
        int n3=dfs(grid,r,c-1);
        int n4=dfs(grid,r,c+1);
        return n1+n2+n3+n4+1;
    }
}
