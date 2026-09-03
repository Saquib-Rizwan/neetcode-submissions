class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int rob1=robCase(nums,0,nums.length-1);
        int rob2=robCase(nums,1,nums.length);
        return Math.max(rob1,rob2);
    }
    private int robCase(int[] nums,int start,int end)
    {
        int prev1=nums[start];
        int prev2=Math.max(nums[start+1],nums[start]);
        for(int i=start+2;i<end;i++)
        {
            int curr=Math.max(prev1+nums[i],prev2);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}
