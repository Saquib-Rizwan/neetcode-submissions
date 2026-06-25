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
        if(!dfs(0,-1))return false;
        return visited.size()==n;
    }
    private boolean dfs(int current,int prev)
    {
        if(visited.contains(current))return false;
        visited.add(current);
        for(int nei:map.get(current))
        {
            if(nei==prev)continue;
            if(!dfs(nei,current))return false;
        }
        return true;
    }
}
