/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        while(second!=null)
        {
            ListNode next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        ListNode m1=head;
        ListNode m2=prev;
        while(m2!=null)
        {
            ListNode temp1=m1.next;
            ListNode temp2=m2.next;

            m1.next=m2;
            m2.next=temp1;
            
            m1=temp1;
            m2=temp2;
        }
    }
}
