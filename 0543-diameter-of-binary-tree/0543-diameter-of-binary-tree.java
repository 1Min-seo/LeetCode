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
    int diameter = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root); //a
        return diameter; //b
    }
    private int depth(TreeNode node){
        if(node == null) return 0; //c

        int left = depth(node.left); //d
        int right = depth(node.right); //e

        diameter = Math.max(diameter, left + right); //f 왼쪽 +  오른쪽 전체 길이
        return Math.max(left, right) + 1; //g 최대 깊이
    }
}