/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
*/
public class RemoveDups {
    //METHOD 1:
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode a = head;
        while (a != null)
        {
            if(a.next == null) break;
            
            if(a.val == a.next.val) a.next = a.next.next; //Skipping a number
            
            else a = a.next;
        }
        return head;
    }
    //METHOD 2: Add all numbers to a set
}