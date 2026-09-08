class WordDictionary {
    private TrieNode root;
    public WordDictionary() {
        root=new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray())
        {
            int idx=c-'a';
            if(curr.children[idx]==null)curr.children[idx]=new TrieNode();
            curr=curr.children[idx];
        }
        curr.isWord=true;
    }

    public boolean search(String word) {
        return dfs(word,0,root);
    }
    private boolean  dfs(String word,int i,TrieNode node)
    {
        if(i==word.length())return node.isWord;
        char c=word.charAt(i);
        if(c!='.')
        {
            if(node.children[c-'a']==null)return false;
            return dfs(word,i+1,node.children[c-'a']);
        }
        for(int j=0;j<26;j++)
        {
            if(node.children[j]==null)continue;
            if(dfs(word,i+1,node.children[j]))return true;
        }
        return false;
        
    }
}
class TrieNode
{
    TrieNode[] children=new TrieNode[26];
    boolean isWord;
}
