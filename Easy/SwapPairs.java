/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class SwapPairs {
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null) return head; //Base case
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head; //Moving ahead
        head = next;
        return head;
    }
}