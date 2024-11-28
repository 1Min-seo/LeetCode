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
class Solution {
    private int result=0;
    public int goodNodes(TreeNode root) {
        func1(root, root.val);
        return result;
    }

    public void func1(TreeNode root, int maxSoFar){
        if(root==null) return;

        if(root.val>=maxSoFar){
            result+=1;  
        }
        maxSoFar=Math.max(maxSoFar, root.val);
        func1(root.left, maxSoFar);
        func1(root.right, maxSoFar);
    }
}