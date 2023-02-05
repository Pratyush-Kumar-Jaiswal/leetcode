/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.

 

Example 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 

Constraints:

1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
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
class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);

    }
    public TreeNode createTree(int[] inorder,int ilo,int ihi,int[] preorder,int plo,int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode nn=new TreeNode(preorder[plo]);
        int idx=search(inorder,ilo,ihi,preorder[plo]);
        int net=idx-ilo;

        nn.left=createTree(inorder,ilo,idx-1,preorder,plo+1,plo+net);
        nn.right=createTree(inorder,idx+1,ihi,preorder,plo+net+1,phi);
        return nn;
    }
    public int search(int[] in,int si,int ei,int item){
        for(int i=si;i<=ei;i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }
}
