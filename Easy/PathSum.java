/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//Given a binary tree and a number, determine if the tree has a root-to-leaf path 
//such that adding the values along the path equals to the given number.

public class PathSum 
{
    public boolean hasPathSum(TreeNode root, int sum) 
    {
        if(root == null) return false; //Not true if sum=0 (that's how the method is)

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return (hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }
}