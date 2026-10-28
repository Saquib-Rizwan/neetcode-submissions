class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        int lsc=1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int newNum=num;
                int count=1;
                while(set.contains(newNum+1))
                {
                    lsc=Math.max(lsc,++count);
                    newNum=newNum+1;
                }
            }
        }
        return lsc;
    }
}
