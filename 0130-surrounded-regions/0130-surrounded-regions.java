class Solution {
    public void solve(char[][] board) {
        
        int[][] vis=new int[board.length][board[0].length];
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(i==0 || j==0|| i==board.length-1 || j==board[0].length-1)
                {
                    if(board[i][j]=='O')
                    {
                        dfs(i,j,vis,board);
                    vis[i][j]=1;
                    }
                    
                }
            }
        }
    
       // return board;
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(vis[i][j]!=1)
                {
                    board[i][j]='X';
                }
                else
                {
                    board[i][j]='O';
                }
            }
        }
    }
    
    public void dfs(int i, int j, int[][]vis, char[][]board)
    {
        int[][] directions={{-1,0},{1,0},{0,1},{0,-1}};
        vis[i][j]=1;
        for(int[]dir: directions)
        {
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && y>=0 && x<board.length && y<board[0].length && vis[x][y]!=1 && board[x][y]=='O')
            {
                dfs(x, y, vis, board);
                vis[x][y]=1;
                
                
            }
        }
    }
}