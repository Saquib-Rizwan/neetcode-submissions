class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length];
        List<Integer> current=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,current,result,used);
        return result;

    }
    private void backtrack(int[] nums,int index,List<Integer> current,List<List<Integer>> result,boolean[] used)
    {
        if(current.size()==nums.length)
        {
            result.add(new ArrayList<>(current));
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])continue;
            current.add(nums[i]);
            used[i]=true;
            backtrack(nums,i,current,result,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}
