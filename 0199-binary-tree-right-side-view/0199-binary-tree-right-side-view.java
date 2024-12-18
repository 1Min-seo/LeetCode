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
 /**
    (1, 
    TreeNode(2,null,5),
    TreeNode(3,null,4))
  */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>result=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return result;

        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0; i<n; i++){
                TreeNode current=q.poll();
                if(i==n-1){
                    result.add(current.val);
                }
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
        }

        return result;
    }
}