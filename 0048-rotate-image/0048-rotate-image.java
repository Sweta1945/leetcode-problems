class Solution {
    public void rotate(int[][] matrix) {
        
        int[][]res=new int[matrix.length][matrix[0].length];
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                res[j][(matrix.length-1)-i]=matrix[i][j];
            }
        }
        
        for(int i=0; i<res.length; i++)
        {
            for(int j=0; j<res[0].length; j++)
            {
                matrix[i][j]=res[i][j];
            }
        }
        
    }
}