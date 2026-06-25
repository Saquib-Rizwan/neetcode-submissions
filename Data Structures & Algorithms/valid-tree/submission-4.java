class Solution {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    HashSet<Integer> visited=new HashSet<>();
    public boolean validTree(int n, int[][] edges) {
        if(n-1!=edges.length)return false;
        for(int i=0;i<n;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        dfs(0,-1);
        return visited.size()==n;
    }
    private void dfs(int current,int prev)
    {
        if(visited.contains(current))return;
        visited.add(current);
        for(int nei:map.get(current))
        {
            if(nei==prev)continue;
            dfs(nei,current);
        }
        return;
    }
}
