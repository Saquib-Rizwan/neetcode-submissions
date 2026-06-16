class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder("");
        List<String> result=new ArrayList<>();
        backtrack(sb,0,0,result,n);
        return result;
    }
    private void backtrack(StringBuilder sb,int open,int close,List<String> result,int n)
    {
        if(sb.length()==2*n)
        {
            result.add(sb.toString());
            return;
        }
        if(open<n)
        {
            sb.append("(");
            backtrack(sb,open+1,close,result,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            sb.append(")");
            backtrack(sb,open,close+1,result,n);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
