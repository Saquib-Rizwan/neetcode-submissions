class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        if(s1.length()>s2.length())return false;
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        if(checkZero(freq))return true;
        int n=s1.length();
        for(int i=s1.length();i<s2.length();i++)
        {
            freq[s2.charAt(i)-'a']--;
            freq[s2.charAt(i-n)-'a']++;
            if(checkZero(freq))return true;
        }
        return false;
    }
    private boolean checkZero(int[] freq)
    {
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)return false;
        }
        return true;
    }
}
