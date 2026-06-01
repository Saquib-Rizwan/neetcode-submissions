class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int lsc=0;
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:nums)
        {
            if(set.contains(num-1))continue;
            else
            {
                int newNum=num;
                int newCount=1;
                while(set.contains(num+1))
                {
                    num++;
                    newCount++;
                }
                lsc=Math.max(lsc,newCount);
            }    
        }
        return lsc;
    }
}
