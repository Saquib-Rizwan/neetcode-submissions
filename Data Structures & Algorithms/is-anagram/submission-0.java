class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha=new int[26];
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(alpha[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
