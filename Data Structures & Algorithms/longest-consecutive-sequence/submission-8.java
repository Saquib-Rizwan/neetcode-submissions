class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int lsc=1;
        if(nums.length==0)return 0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int count=1;
                int newNum=num;
                while(set.contains(newNum+1))
                {
                    newNum=newNum+1;
                    count++;
                    lsc=Math.max(lsc,count);
                }
            }
        }
        return lsc;
    }   
}
