/*
Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:


Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]
Example 2:

Input: root = [1]
Output: ["1"]
 

Constraints:

The number of nodes in the tree is in the range [1, 100].
-100 <= Node.val <= 100
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
class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();

        if(root==null){return result;}

        String current_path=Integer.toString(root.val);

        if(root.left==null && root.right==null){result.add(current_path);}
        if(root.left!=null){dfs(root.left,result,current_path);}
        if(root.right!=null){dfs(root.right,result,current_path);}
        return result;
    }
    public static void dfs(TreeNode node,List result,String current_path){
        current_path+="->"+node.val;
        if(node.left==null && node.right==null){
            result.add(current_path);
            return;
        }
        if(node.left!=null){dfs(node.left,result,current_path);}
        if(node.right!=null){dfs(node.right,result,current_path);}

    }
}
