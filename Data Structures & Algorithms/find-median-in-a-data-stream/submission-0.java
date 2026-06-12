class MedianFinder {
    PriorityQueue<Integer> minH;
    PriorityQueue<Integer> maxH;
    public MedianFinder() {
        minH=new PriorityQueue<>();
        maxH=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        maxH.offer(num);
        minH.offer(maxH.poll());
        if(minH.size()>maxH.size())
        {
            maxH.offer(minH.poll());
        }
    }
    
    public double findMedian() {
        if(maxH.size()>minH.size())return (double)maxH.peek();
        return (double)(maxH.peek()+minH.peek())/2;
    }
}
