class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->freq.get(b)-freq.get(a));
        int[] ans=new int[k];
        for(int num:nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(int num:freq.keySet())
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
