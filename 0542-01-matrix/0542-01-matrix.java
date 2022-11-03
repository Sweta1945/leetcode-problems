class Solution {
    public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]>q=new ArrayDeque<>();
        int[][] vis=new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++)
        {
          for(int j=0; j<mat[0].length; j++)
             {
                if(mat[i][j]==0)
                   {
                      q.add(new int[]{i,j,0});
                       vis[i][j]=1;  
                    }
                 }
             }
         int[][] directions={{-1,0},{1,0},{0,-1},{0,1}};
         int[][] res=new int[mat.length][mat[0].length];
         while(q.size()>0)
         {
            int[] node=q.remove();
            int i=node[0];
             int j=node[1];
             int pos=node[2];
             
             res[i][j]=pos;
             
             for(int[] dir: directions)
             {
                 int x=i+dir[0];
                 int y=j+dir[1];
                 
if(x>=0 && y>=0 && x<mat.length && y<mat[0].length && vis[x][y]!=1 )
                 {
                    q.add(new int[] {x,y, pos+1});
                    vis[x][y]=1;
                     
                 }
             }
            
         }
        return res;
    }
}