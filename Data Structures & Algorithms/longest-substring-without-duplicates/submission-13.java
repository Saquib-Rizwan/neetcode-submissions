class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> seen=new HashMap<>();
        if(s.length()==0)return 0;
        int left=0;
        int length=1;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(seen.containsKey(ch))
            {
                left=Math.max(left,seen.get(ch)+1);
            }
            length=Math.max(length,right-left+1);
            seen.put(ch,right);
        }
        return length;
    }
}
