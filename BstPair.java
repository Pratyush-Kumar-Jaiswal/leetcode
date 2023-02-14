/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left 
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1

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
class BstPair{
        boolean isbst=true;
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
    }
    class Solution{
        public boolean isValidBST(TreeNode root) {
            return ValidBst(root).isbst;
        }
        public BstPair ValidBst(TreeNode root){
            if(root==null){
                return new BstPair();
            }
            BstPair lbp=ValidBst(root.left);
            BstPair rbp=ValidBst(root.right);
            BstPair sbp=new BstPair();
            sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
            sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
            if(lbp.isbst && rbp.isbst && lbp.max<root.val && rbp.min>root.val){
                sbp.isbst=true;
            }
            else{
                sbp.isbst=false;
            }
            return sbp;
        }
    }
