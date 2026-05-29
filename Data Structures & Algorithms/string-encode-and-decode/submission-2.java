class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str:strs)
        {
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();   
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int hash=i;
            while(str.charAt(hash)!='#')
            {
                hash++;
            }
            int length=Integer.parseInt(str.substring(i,hash));
            res.add(str.substring(hash+1,hash+1+length));
            i=hash+1+length;
        }
        return res;
    }
}
