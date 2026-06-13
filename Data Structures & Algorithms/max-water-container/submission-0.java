class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int maxArea=0;
        while(l<r)
        {
            int left=heights[l];
            int right=heights[r];
            if(left<right)
            {
                maxArea=Math.max(maxArea,left*(r-l));
                l++;
            }
            else
            {
                maxArea=Math.max(maxArea,right*(r-l));
                r--;
            }
        }
        return maxArea;
    }
}
