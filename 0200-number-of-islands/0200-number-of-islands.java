class Solution {
    class pair{
        int first;
        int second;
        public pair(int first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public int numIslands(char[][] grid) {
        
        int[][] visited=new int[grid.length][grid[0].length];
        for(int i=0; i<visited.length; i++)
        {
            for(int j=0; j<visited[0].length; j++)
            {
                visited[i][j]=0;
            }
        }
        int count=0;
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j]=='1' && visited[i][j]!=1)
                {
                    count++;
                    bfs(grid, i, j, visited);
                }
            }
        }
        return count;
        
    }
    
    public void bfs(char[][] grid, int i, int j, int[][]visited)
    {
        int[][] direction = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };
        visited[i][j]=1;
        Queue<pair> q=new ArrayDeque<>();
        q.add(new pair(i, j));
        
        while(!q.isEmpty())
        {
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            
            for(int[] dir: direction)
            {
                int x=row+dir[0];
                int y=col+dir[1];
                
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y]=='1' && visited[x][y]!=1)
                {
                    q.add(new pair(x,y));
                    visited[x][y]=1;
                }
            }
        }
        
        
        
    }
}