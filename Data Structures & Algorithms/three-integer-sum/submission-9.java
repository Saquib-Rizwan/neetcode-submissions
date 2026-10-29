class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length && nums[i]<=0;i++)
        {
            if(i==0||nums[i]!=nums[i-1])
            {
                twoSum(result,i,nums[i],nums);
            }
        }
        return result;
    }
    public void twoSum(List<List<Integer>> result,int start,int num,int[] nums)
    {
        int left=start+1;
        int right=nums.length-1;
        while(left<right)
        {
            int sum=nums[left]+nums[right]+num;
            if(sum==0)
            {
                result.add(new ArrayList(Arrays.asList(num,nums[left],nums[right])));
                left++;
                right--;
                while(left<right && nums[left]==nums[left-1])
                {
                    left++;
                }
            }
            else if(sum>0)right--;
            else left++;
        }
    }
}
