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
    public boolean isValidBST(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && root.left.val >= root.val) {
            return false;
        }
        if (root.right != null && root.right.val <= root.val) {
            return false;
        }
        return check(root.left, -10000000, root.val) && check(root.right, root.val, 10000000);

    }

    private boolean check(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.left != null && (root.left.val >= max || root.left.val <= min)) {
            return false;
        }
        if (root.right != null && (root.right.val <= min || root.right.val >= max)) {
            return false;
        }
        return check(root.left, min, root.val) && check(root.right, root.val, max);
    }

}
