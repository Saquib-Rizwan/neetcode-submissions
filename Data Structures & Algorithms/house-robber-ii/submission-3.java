class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int case1=robCase(nums,0,n-1);
        int case2=robCase(nums,1,n);
        return Math.max(case1,case2);
    }
    private int robCase(int[] nums,int start,int end)
    {
        int prev=nums[start];
        int curr=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<end;i++)
        {
            int newcurr=Math.max(prev+nums[i],curr);
            prev=curr;
            curr=newcurr;
        }
        return curr;
    }
}
