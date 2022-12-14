//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis=new int[adj.size()];
        int[] pathVis=new int[adj.size()];
        for(int i=0; i<adj.size(); i++)
        {
            if(vis[i]!=1)
            {
                if(dfs(i, adj, vis, pathVis)==true)
                return true;
                
            }
        }
        return false;
    }
    public boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathVis)
    {
        vis[i]=1;
        pathVis[i]=1;
        
        for(int k: adj.get(i))
        {
            if(vis[k]!=1)
            {
                if(dfs(k, adj, vis, pathVis)==true)
                return true;
                
            }
            else if(vis[k]==1 && pathVis[k]==1)
            {
                return true;
            }
        }
        
        pathVis[i]=0;
        return false;
    }
}