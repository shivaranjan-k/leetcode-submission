class Solution {
    static int nodes;
    static int edges_c;

    static void dfs(int node,boolean visited[],ArrayList<ArrayList<Integer>>graph){
        
        visited[node] = true;
        nodes++;

        edges_c += graph.get(node).size();

        for(int neighbour:graph.get(node)){

            if(!visited[neighbour]){
               
                dfs(neighbour,visited,graph);

                
            }
        }     
    }

    public int countCompleteComponents(int n, int[][] edges) {

        ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
        for(int i = 0;i < n;i++){
            graph.add(new ArrayList<>());
        }

        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int count = 0;
        boolean visited[] = new boolean[n];
        for(int i = 0;i < n;i++){

            nodes = 0;
            edges_c = 0;
            
          if(!visited[i]){
             dfs(i,visited,graph);
             int act_edge = edges_c / 2;
                int req_edge = nodes * (nodes - 1) / 2;

                if(act_edge == req_edge) count++;
          }
        }

        return count;
        
    }
}