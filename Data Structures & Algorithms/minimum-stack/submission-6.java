class MinStack {
    Node head;
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head==null)
        {
            head=new Node(val,val);
        }
        else
        {
            Node n=new Node(val,Math.min(head.min,val));
            n.next=head;
            head=n;
        }
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
class Node
{
    int val;
    int min;
    Node next;
    public Node(int val,int min)
    {
        this.val=val;
        this.min=min;
    }
}
