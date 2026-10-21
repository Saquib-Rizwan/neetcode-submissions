class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result=new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            result[i]=result[i-1]*nums[i-1];
        }
        int postFix=1;
        for(int i=n-1;i>=0;i--)
        {
            result[i]=result[i]*postFix;
            postFix=postFix*nums[i];
        }
        return result;
    }
}  
