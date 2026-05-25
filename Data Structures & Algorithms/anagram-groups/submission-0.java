class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res=new HashMap<>();
        for(String s:strs)
        {
            int[] alpha=new int[26];
            for(char ch:s.toCharArray())
            {
                alpha[ch-'a']++;
            }
            String key=Arrays.toString(alpha);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
