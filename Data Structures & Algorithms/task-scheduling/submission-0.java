class Solution {
    public int leastInterval(char[] tasks, int n) {
        int ans=0;
        int[] freq=new int[26];
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<tasks.length;i++)
        {
            freq[tasks[i]-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                maxHeap.offer(freq[i]);
            }
        }
        while(!maxHeap.isEmpty())
        {
            int cycle=n+1;
            int taskCompleted=0;
            List<Integer> l=new ArrayList<>();
            while(cycle>0 && !maxHeap.isEmpty())
            {
                int currTask=maxHeap.poll();
                if(currTask>1)
                {
                    l.add(currTask-1);
                }
                cycle--;
                taskCompleted++;
            }
            for(int e:l)
            {
                maxHeap.offer(e);
            }
            ans+=(maxHeap.isEmpty())?taskCompleted:n+1;
        }
        return ans;
    }
}
