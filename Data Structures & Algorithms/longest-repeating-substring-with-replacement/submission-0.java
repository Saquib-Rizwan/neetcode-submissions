class Solution {
    public int characterReplacement(String s, int k) {
        int start=0;
        int max=0;
        int[] alpha=new int[26];
        for(int end=0;end<s.length();end++)
        {
            max=Math.max(max,++alpha[s.charAt(end)-'A']);
            if((end-start+1)-max>k)
            {
                alpha[s.charAt(start)-'A']--;
                start++;
            }
        }
        return s.length()-start;
    }
}