class Solution {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    HashSet<Integer> visitpath=new HashSet<>();
    public int countComponents(int n, int[][] edges) {
        int count=0;
        for(int i=0;i<n;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int[] edge:edges)
        {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);    
        }
        for(int i=0;i<n;i++)
        {
            if(!visitpath.contains(i))
            {
                count++;
                dfs(i);
            }
        }
        return count;
    }
    private void dfs(int node)
    {
        visitpath.add(node);
        for(int nei:map.get(node))
        {
            if(!visitpath.contains(nei))dfs(nei);
        }
    }
}
