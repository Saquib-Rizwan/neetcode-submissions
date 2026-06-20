class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int longest=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch))
            {
                left=Math.max(left,map.get(ch)+1);
            }
            longest=Math.max(longest,right-left+1);
            map.put(ch,right);
        }
        return longest;
    }
}
