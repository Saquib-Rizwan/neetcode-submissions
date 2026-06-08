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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "N,";
        return root.val+","+serialize(root.left)+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>();
        q.addAll(Arrays.asList(data.split(",")));
        return buildTree(q);
    }
    private TreeNode buildTree(Queue<String> q)
    {
        String str=q.remove();
        if(str.equals("N"))return null;
        int val=Integer.parseInt(str);
        TreeNode node=new TreeNode(val);
        node.left=buildTree(q);
        node.right=buildTree(q);
        return node;
    }
}
