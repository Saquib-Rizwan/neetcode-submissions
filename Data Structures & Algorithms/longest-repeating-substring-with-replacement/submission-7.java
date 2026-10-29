class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxFreq=0;
        int length=0;
        for(int right=0;right<s.length();right++)
        {
            maxFreq=Math.max(maxFreq,++freq[s.charAt(right)-'A']);
            if(right-left+1-maxFreq>k)
            {
                freq[s.charAt(left++)-'A']--;
            }
            length=Math.max(right-left+1,length);
        }
        return length;
    }
}
