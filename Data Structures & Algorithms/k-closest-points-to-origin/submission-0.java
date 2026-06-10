class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] res=new int[k][2];
        HashMap<int[],Integer> map=new HashMap<>();
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(int i=0;i<points.length;i++)
        {
            int distance=(points[i][0]-0)*(points[i][0]-0)+(points[i][1]-0)*(points[i][1]-0);
            map.put(points[i],distance);
        }
        for(int i=0;i<points.length;i++)
        {
            q.offer(points[i]);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            res[i]=q.poll();
        }
        return res;
    }
}
