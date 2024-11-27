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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        func1(root1, l1);
        func2(root2, l2);

        if(l1.equals(l2)) return true;
        else return false;
    }

    public void func1(TreeNode root1, List<Integer> l1){
        if(root1==null) return;
        if((root1.left==null) && (root1.right==null)){
            l1.add(root1.val);
            return;
        }
        func1(root1.left, l1);
        func2(root1.right, l1);
    }

    public void func2(TreeNode root2, List<Integer> l2){
        if(root2==null) return;
        if((root2.left== null)&&(root2.right==null)){
            l2.add(root2.val);
        }

        func2(root2.left, l2);
        func2(root2.right, l2);
    }
}