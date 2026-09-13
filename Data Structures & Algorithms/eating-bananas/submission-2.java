class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles)
        {
            if(p>high)
            {
                high=p;
            }
        }
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canFinish(piles,mid,h))
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
    private boolean canFinish(int[] piles,int speed,int h)
    {
        int count=0;
        for(int p:piles)
        {
            count+=Math.ceil((double)p/speed);
        }
        return count<=h;
    }
}
