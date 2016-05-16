/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Given two linked lists representing two non-negative numbers, are stored in reverse order and each node contains a single digit. 
//Add the two numbers and return it as a linked list.
public class AddListNum 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode ans = new ListNode(0);
        ListNode d = ans;
        int sum = 0;
        while (c1 != null || c2 != null) 
        {
            sum /= 10;
            if (c1 != null) 
            {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) 
            {
                sum += c2.val;
                c2 = c2.next;
            }
            d.next = new ListNode(sum % 10);
            d = d.next;
        }
        if (sum / 10 == 1)
            d.next = new ListNode(1);
        return ans.next;
    }
}