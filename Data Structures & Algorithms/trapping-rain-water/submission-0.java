class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int trapped=0;
        while(left<right)
        {
            if(height[left]<=height[right])
            {
                leftmax=Math.max(height[left],leftmax);
                trapped+=leftmax-height[left];
                left++;
            }
            else
            {
                rightmax=Math.max(height[right],rightmax);
                trapped+=rightmax-height[right];
                right--;
            }
        }
        return trapped;
    }
}
