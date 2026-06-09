class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int w:stones)
        {
            q.offer(w);
        }
        while(q.size()>1)
        {
            int w1=q.poll();
            int w2=q.poll();
            if(w1==w2)continue;
            q.offer(w1-w2);
        }
        if(q.isEmpty())return 0;
        return q.peek();
    }
}
