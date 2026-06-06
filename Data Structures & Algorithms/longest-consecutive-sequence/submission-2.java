class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int maxCount=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:nums)
        {
            if(set.contains(num-1))continue;
            int currentNum=num;
            int count=1;
            while(set.contains(currentNum+1))
            {
                currentNum++;
                count++;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
