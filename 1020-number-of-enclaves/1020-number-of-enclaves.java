class Solution {
    public int numEnclaves(int[][] board) {
  int m = board.length;
        int n = board[0].length;
        int count=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1 && board[i][j] == 1) {
                    flip(board, i, j);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    count++;
                }
                else if (board[i][j] == -1) {
                    board[i][j] = 0;
                }
            }
        }
        return count;
    }
    
    private void flip(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int[][] direction={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        
        if (board[i][j] == 1) {
            board[i][j] = -1;
            
           for(int[] dir: direction)
           {
               flip(board, i+dir[0], j+dir[1] );
           }
        }        
    }
}