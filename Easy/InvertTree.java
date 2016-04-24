/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*

Sample Input:

     5
   /   \
  7     8
 / \   / \
3   4 1   2

Sample Output:

     5
   /   \
  8     7
 / \   / \
2   1 4   3

*/

public class InvertTree {
    public TreeNode invertTree(TreeNode root)
    {
        if(root == null) return root;
        if(root.left == null && root.right==null) return root;
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
