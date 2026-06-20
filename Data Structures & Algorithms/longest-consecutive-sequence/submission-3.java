class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int Lsc=0;
        for(int num:set)
        {
            if(set.contains(num-1))continue;
            int currentNum=num;
            int freq=1;
            while(set.contains(currentNum+1))
            {
                freq++;
                currentNum++;
            }
            Lsc=Math.max(Lsc,freq);
        }
        return Lsc;
    }
}
