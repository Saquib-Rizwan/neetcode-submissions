class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        int[] result=new int[k];
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())
        {
            q.offer(num);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            result[i]=q.poll();
        }
        return result;
    }
}
