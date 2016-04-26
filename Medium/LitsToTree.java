/**
 * Class definition for singly-linked list:
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Class definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ListToTree {
    public TreeNode sortedListToBST(ListNode head) 
    {
        if(head == null) return null; //Base case
        if(head.next == null) return new TreeNode(head.val); //Base case
        if(head.next.next == null) //Base case- Only 2 elements in the tree
        {
            TreeNode root = new TreeNode(head.val);
            root.right = new TreeNode(head.next.val);
            return root;
        }
        
        ListNode fast=head, slow=head, prev=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        //slow will be the middle- root of tree
        TreeNode root = new TreeNode (slow.val);
        
        prev.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        
        return root;
    }
}