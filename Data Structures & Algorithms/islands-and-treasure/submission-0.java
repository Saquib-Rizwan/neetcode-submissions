class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]>q=new LinkedList<>();
        for(int r=0;r<grid.length;r++)
        {
            for(int c=0;c<grid[0].length;c++)
            {
                if(grid[r][c]==0)
                {
                    q.offer(new int[]{r,c});
                }
            }
        }
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty())
        {
            int[] current=q.poll();
            int oldr=current[0];
            int oldc=current[1];
            for(int[] direction:directions)
            {
                int nr=oldr+direction[0];
                int nc=oldc+direction[1];
                if(nr>=grid.length||nr<0||nc>=grid[0].length||nc<0||grid[nr][nc]!=Integer.MAX_VALUE)continue;
                grid[nr][nc]=grid[oldr][oldc]+1;
                q.offer(new int[]{nr,nc});
            }
        }
    }
}
