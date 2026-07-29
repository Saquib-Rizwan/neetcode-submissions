class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int left=0;
        int right=heights.length-1;
        while(left<right)
        {
            int height=Math.min(heights[left],heights[right]);
            int width=right-left;
            maxArea=Math.max(maxArea,height*width);
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}
