class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<=isConnected.length; i++)
        {
            arr.add(new ArrayList<>());
        }
        
        for(int i=0; i<isConnected.length; i++)
        {
            for(int j=0; j<isConnected.length; j++)
            {
                if(i!=j && isConnected[i][j]==1)
                {
                    arr.get(i+1).add(j+1);
                    arr.get(j+1).add(i+1);
                }
            }
        }
        int count=0;
        int[] vis=new int[isConnected.length+1];
        for(int i=1; i<=isConnected.length; i++)
        {
            if(vis[i]!=1)
            {
            vis[i]=1;
            bfs(i, vis, arr);
            count++;
            }
            
        }
        return count;
    }
    
    public void bfs(int i, int[] vis, ArrayList<ArrayList<Integer>> arr)
    {
        vis[i]=1;
        Queue<Integer> q=new ArrayDeque<>();
        q.add(i);
        
        while(q.size()>0)
        {
            int k=q.remove();
            for(int num: arr.get(k))
            {
                
                if(vis[num]!=1)
                {
            q.add(num);
            vis[num]=1;
                }
            
            }
        }
    }
}