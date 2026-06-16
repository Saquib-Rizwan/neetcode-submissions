class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        backtrack(n,sb,result,0,0);
        return result;
    }
    private void backtrack(int n,StringBuilder sb,List<String> result,int open,int close)
    {
        if(sb.length()==2*n)
        {
            result.add(sb.toString());
            return;
        }
        if(open<n)
        {
            sb.append("(");
            backtrack(n,sb,result,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(")");
            backtrack(n,sb,result,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
