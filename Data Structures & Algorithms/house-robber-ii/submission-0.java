class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int case1=caseRob(0,n-1,nums);
        int case2=caseRob(1,n,nums);
        return Math.max(case1,case2);
    }
    private int caseRob(int start,int end,int[] nums)
    {
        int prev1=nums[start];
        int prev2=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<end;i++)
        {
            int curr=Math.max(prev1+nums[i],prev2);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}
