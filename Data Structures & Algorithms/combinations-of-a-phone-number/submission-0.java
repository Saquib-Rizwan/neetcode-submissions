class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length()==0)return new ArrayList<>();
        backtrack(digits,sb,0,result,map);
        return result;
    }
    private void backtrack(String digits,StringBuilder sb,int index,List<String> result,HashMap<Character,String> map)
    {
        if(sb.length()==digits.length())
        {
            result.add(sb.toString());
            return;
        }
        String letters=map.get(digits.charAt(index));
        for(int i=0;i<letters.length();i++)
        {
            sb.append(letters.charAt(i));;
            backtrack(digits,sb,index+1,result,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
