class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFreq=0;
        int[] alpha=new int[26];
        int length=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            maxFreq=Math.max(maxFreq,++alpha[ch-'A']);
            while((right-left+1)-maxFreq>k)
            {
                alpha[s.charAt(left)-'A']--;
                left++;
            }
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}
