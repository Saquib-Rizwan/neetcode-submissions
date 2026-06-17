class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int[] freq=new int[26];
        int maxFreq=0;
        int longest=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            if((right-left+1)-maxFreq<=k)
            {
                longest=Math.max(longest,(right-left+1));
            }
            else
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
        }
        return longest;
    }
}
