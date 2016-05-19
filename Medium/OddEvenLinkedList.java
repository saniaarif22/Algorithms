/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Given a singly linked list, group all odd numbered nodes together followed by the even numbered nodes.

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) 
    {
        if(head==null || head.next==null || head.next.next == null) return head;
        ListNode odd = head, even=head.next, evenStart = even;
        while(odd!=null && odd.next!=null && even!=null && even.next!=null)
        {
            odd.next = odd.next.next;
            odd= odd.next;
            even.next = even.next.next;
            even= even.next;
        }
        odd.next = evenStart;
        return head;
        
    }
}