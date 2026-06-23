class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        for(int num:gifts)
        {
            q.offer(num);
        }
        for(int i=0;i<k;i++)
        {
            q.offer((int)(Math.sqrt(q.poll())));
        }
        while(!q.isEmpty())
        {
            sum+=q.poll();
        }
        return sum;
    }
}