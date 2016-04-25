/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
// The maximum depth refers to the number of nodes along the longest path from the root to the farthest leaf node.

public class MaxDepthTree {
    public int maxDepth(TreeNode root)
    {
        //Base cases:
        if(root == null) return 0; 
        if(root.left == null && root.right == null) return 1;
        
        //Recursive funtion
        return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}
