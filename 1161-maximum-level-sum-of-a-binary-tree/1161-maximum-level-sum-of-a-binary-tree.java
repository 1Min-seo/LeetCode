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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();

        q.offer(root);
        int max = Integer.MIN_VALUE;
        int level=1;
        int ans = 0;
        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            for(int i=0; i<n; i++){
                TreeNode current=q.poll();
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
                sum+= current.val;
            
            }
            //result=Math.max(result, sum);
            if(sum > max) {
                max = sum;
                ans = level;
            }
            level++;
        }

        return ans;
    }
}