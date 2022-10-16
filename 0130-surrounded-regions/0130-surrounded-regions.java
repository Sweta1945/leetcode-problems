// All the "O" that are not directly/indirectly connected to the "O" on the boundary line, will be captured and converted into "X"

// Just traverse the matrix once, and as soon as your enounter a boundary line that has a "O" in it, run DFS on this "O" and "Save" all the nehgbours of this "O" from being captured by calling them "S"

// Now traverse the matrix again and capture all the "O" that you can inside the matrix except the boundary line

// Rename the "Save" O back to "O"
// Done!
class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1 && board[i][j] == 'O') {
                    flip(board, i, j);
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if (board[i][j] == 'S') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    
    private void flip(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int[][] direction={{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        
        if (board[i][j] == 'O') {
            board[i][j] = 'S';
            
           for(int[] dir: direction)
           {
               flip(board, i+dir[0], j+dir[1] );
           }
        }        
    }
}