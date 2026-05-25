class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        int[] result=new int[k];
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            heap.add(key);
            if(heap.size()>k)
            {
                heap.poll();
            }
        }
        for(int i=0;i<k;i++)
        {
            result[i]=heap.poll();
        }
        return result;        
    }
}
