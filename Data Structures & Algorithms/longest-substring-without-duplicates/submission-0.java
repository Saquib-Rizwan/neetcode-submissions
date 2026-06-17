class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        HashMap<Character,Integer> seen=new HashMap<>();
        int maxLength=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(seen.containsKey(ch))
            {
                left=Math.max(left,seen.get(ch)+1);
            }
            seen.put(ch,right);
            maxLength=Math.max(maxLength,(right-left)+1);
        }
        return maxLength;
    }
}
