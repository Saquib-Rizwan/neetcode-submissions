class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int n=matrix[0].length;
        int high=matrix.length*matrix[0].length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return false;
    }
}
