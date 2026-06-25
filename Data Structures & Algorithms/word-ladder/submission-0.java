class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord))return 0;
        set.remove(beginWord);
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        int count=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                String word=q.poll();
                for(int j=0;j<word.length();j++)
                {
                    char[] wordtochar=word.toCharArray();
                    for(char ch='a';ch<='z';ch++)
                    {
                        wordtochar[j]=ch;
                        String newWord=new String(wordtochar);
                        if(set.contains(newWord))
                        {
                            if(newWord.equals(endWord))return count+1;
                            set.remove(newWord);
                            q.offer(newWord);
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }
}
