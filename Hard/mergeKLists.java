public class mergeKLists {
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length==0) return null;

        ListNode head = new ListNode(0);
        ListNode temp = head;

        PriorityQueue<ListNode> p = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1,ListNode o2)
            {
                if (o1.val<o2.val)
                    return -1;
                    
                else if (o1.val==o2.val)
                    return 0;
                
                else 
                    return 1;
            }
        });
        
        for (ListNode node:lists)
        {
            if (node!=null)
                p.add(node);
        }
        
        while (!p.isEmpty())
        {
            temp.next = p.poll();
            temp = temp.next;

            if (temp.next!=null)
                p.add(temp.next);
        }
        return head.next;
    }
}