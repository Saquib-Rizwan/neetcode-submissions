class Solution {
    private HashMap<Integer,List<Integer>> map=new HashMap<>();
    private HashSet<Integer> visitpath=new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++)
        {
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        for(int i=0;i<numCourses;i++)
        {
            if(!dfs(i))return false;
        }
        return true;
    }
    private boolean dfs(int crs)
    {
        if(visitpath.contains(crs))return false;
        if(map.get(crs).isEmpty())return true;
        visitpath.add(crs);
        for(int crsReq:map.get(crs))
        {
            if(!dfs(crsReq))return false;
        }
        visitpath.remove(crs);
        map.put(crs,new ArrayList<>());
        return true;

    }
}
