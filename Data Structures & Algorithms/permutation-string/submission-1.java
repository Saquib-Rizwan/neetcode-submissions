class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2)return false;
        for(int i=0;i<len1;i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        if(isZero(freq))return true;
        for(int i=len1;i<len2;i++)
        {
            freq[s2.charAt(i)-'a']--;
            freq[s2.charAt(i-len1)-'a']++;
            if(isZero(freq))return true;
        }
        return false;
    }
    private boolean isZero(int[] freq){
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)return false;
        }
        return true;
    }
}
