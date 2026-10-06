class LRUCache {
    int capacity;
    Node left;
    Node right;
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        left=new Node(0,0);
        right=new Node(0,0);
        left.next=right;
        right.prev=left;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node n=map.get(key);
            int value=n.value;
            remove(n);
            insert(n);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node n=map.get(key);
            n.value=value;
            remove(n);
            insert(n);
            return;
        }
        Node newNode=new Node(key,value);
        insert(newNode);
        map.put(key,newNode);
        if(map.size()>capacity)
        {
            Node lru=left.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
    public void insert(Node n)
    {
        Node prev=right.prev;
        prev.next=n;
        n.prev=prev;
        n.next=right;
        right.prev=n;
    }
    public void remove(Node n)
    {
        Node prev=n.prev;
        Node nxt=n.next;
        prev.next=nxt;
        nxt.prev=prev;
    }
}
public class Node
{
    int key;
    int value;
    Node prev;
    Node next;
    public Node(int key,int val)
    {
        this.key=key;
        this.value=val;
        this.next=null;
        this.prev=null;
    }
}
