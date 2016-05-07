
public class SwapPairs {
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null) return head;
        ListNode next = head.next;
        head.next = swapPairs(head.next.next);
        next.next = head;
        head = next;
        return head;
    }
}