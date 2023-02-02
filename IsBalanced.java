/*
Given a binary tree, determine if it is 
height-balanced
.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
*/



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);
        boolean isbal=Math.abs(ht(root.left)-ht(root.right))<=1;
        return left && right && isbal;
    }
    public int ht(TreeNode root){
        if(root==null){
            return -1;
        }
        int lh=ht(root.left);
        int rh=ht(root.right);
        return Math.max(lh,rh)+1;
    }
}
