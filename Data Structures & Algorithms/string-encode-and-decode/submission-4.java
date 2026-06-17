class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder("");
        for(String str:strs)
        {
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            int hash=i;
            while(str.charAt(hash)!='#')
            {
                hash++;
            }
            int length=Integer.parseInt(str.substring(i,hash));
            result.add(str.substring(hash+1,hash+length+1));
            i=hash+length;
        }
        return result;
    }
}
