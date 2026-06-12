class Twitter {
    HashMap<Integer,List<int[]>> tweet;
    HashMap<Integer,HashSet<Integer>> followMap;
    int timeStamp;
    public Twitter() {
        timeStamp=0;
        tweet=new HashMap<>();
        followMap=new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweet.putIfAbsent(userId,new ArrayList<>());
        tweet.get(userId).add(new int[]{timeStamp++,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        HashSet<Integer> followSet=followMap.getOrDefault(userId,new HashSet<>());
        followSet.add(userId);
        for(int f:followSet)
        {
            List<int[]> tweetList=tweet.getOrDefault(f,new ArrayList<>());
            maxHeap.addAll(tweetList);
        }
        List<Integer> res=new ArrayList<>();
        while(!maxHeap.isEmpty()&&res.size()<10)
        {
            res.add(maxHeap.poll()[1]);
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId,new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        followMap.getOrDefault(followerId,new HashSet<>());
        followMap.get(followerId).remove(followeeId);
    }
}
