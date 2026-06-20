class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        int[] ans=new int[k];
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())
        {
            q.offer(num);
        }
        for(int i=0;i<k;i++)
        {
            ans[i]=q.poll();
        }
        return ans;
    }
}
