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
    int ctr = 0;
    public int goodNodes(TreeNode root) {
        help(root, root.val);
        return ctr;
    }
    private void help(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max ) {
            ctr++;
            max = root.val;
        }
        help(root.left, max);
        help(root.right, max);

    }
}
