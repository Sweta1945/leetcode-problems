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
    public void setZeroes(int[][] matrix) {
        Queue<pair> q=new  ArrayDeque<>();
        
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    q.add(new pair(i, j));
                }
            }
        }
        int[][]dir={{1,0},{-1,0},{0,1},{0,-1}};
      while(!q.isEmpty())
      {
          pair res=q.remove();
          int row=res.first;
          int col=res.second;
                    
if(row>=0 && col>=0 && row<matrix.length && col<matrix[0].length)
{
    
    for(int i=0; i<matrix.length; i++)
         {
             matrix[i][col]=0;
         }
    
    for(int k=0; k<matrix[0].length; k++)
         {
             matrix[row][k]=0;
         }
    
    
}
         
              
          }
      }
        
       
        
    
}