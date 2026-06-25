class Solution {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    HashSet<Integer> path=new HashSet<>();
    public boolean validTree(int n, int[][] edges) {
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
        return path.size()==n;
    }
    private boolean dfs(int current,int prev)
    {
        if(path.contains(current))return false;
        path.add(current);
        for(int i:map.get(current))
        {
            if(i==prev)continue;
            if(!dfs(i,current))return false;
        }
        return true;
    }
}
