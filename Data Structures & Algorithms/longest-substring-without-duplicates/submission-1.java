class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int length=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch))
            {
                left=Math.max(left,map.get(ch)+1);
            }
            map.put(ch,right);
            length=Math.max(length,(right-left+1));
        }
        return length;
    }
}
