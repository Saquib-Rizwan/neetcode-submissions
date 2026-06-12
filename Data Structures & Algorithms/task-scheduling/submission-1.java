class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<tasks.length;i++)
        {
            freq[tasks[i]-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)q.offer(freq[i]);   
        }
        while(!q.isEmpty())
        {
            int cycle=n+1;
            List<Integer> l=new ArrayList<>();
            int taskCompleted=0;
            while(cycle>0&&!q.isEmpty())
            {
                int currTask=q.poll();
                if(currTask>1)
                {
                    l.add(currTask-1);
                }
                cycle--;
                taskCompleted++;
            }
            for(int e:l)
            {
                q.offer(e);
            }
            ans+=(q.isEmpty())?taskCompleted:n+1;
        }
        return ans;
    }
}
