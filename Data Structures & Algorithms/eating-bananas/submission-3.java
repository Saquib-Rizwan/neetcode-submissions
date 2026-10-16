class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles)
        {
            high=Math.max(high,p);
        }
        int answer=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canFinish(piles,h,mid))
            {
                answer=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return answer;
    }
    public boolean canFinish(int[] piles,int h,int speed)
    {
        double hours=0;
        for(int p:piles)
        {
            hours+=Math.ceil((double)p/speed);
        }
        return hours<=h;
    }
}
