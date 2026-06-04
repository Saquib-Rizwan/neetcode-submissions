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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return res;
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> level=new ArrayList<>();
            for(int i=q.size();i>0;i--)
            {
                TreeNode n=q.poll();
                if(n!=null)
                {
                    level.add(n.val);
                    if(n.left!=null)q.offer(n.left);
                    if(n.right!=null)q.offer(n.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}
