class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String str:tokens)
        {
            if(str.equals("+"))
            {
                int top1=stack.pop();
                int top2=stack.pop();
                stack.push(top2+top1);
            }
            else if(str.equals("*"))
            {
                int top1=stack.pop();
                int top2=stack.pop();
                stack.push(top2*top1);
            }
            else if(str.equals("-"))
            {
                int top1=stack.pop();
                int top2=stack.pop();
                stack.push(top2-top1);
            }
            else if(str.equals("/"))
            {
                int top1=stack.pop();
                int top2=stack.pop();
                stack.push(top2/top1);
            }
            else
            {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}
