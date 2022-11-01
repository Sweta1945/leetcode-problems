class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int[][] vis=new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(vis[i][j]!=1 && grid[i][j]=='1')
                {
                    vis[i][j]=1;
                    bfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, int[][]vis, char[][]grid)
    {
        int[][] direction={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        vis[i][j]=1;
        
        Queue<int[]> q=new ArrayDeque<>();
        
        q.add(new int[]{i, j});
        
        while(q.size()>0)
        {
            int[] node=q.remove();
            int i_new=node[0];
            int j_new=node[1];
            
            for(int[] dir: direction)
            {
                int x=i_new+dir[0];
                int y=j_new+ dir[1];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='1' && vis[x][y]!=1)
                {
                    q.add(new int[]{x,y});
                    vis[x][y]=1;
                }
            }
            
        }
    }
}