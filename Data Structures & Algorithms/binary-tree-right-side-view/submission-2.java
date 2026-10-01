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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return result;
        }
        result.add(root.val);
        help(root, 1);
        return result;
    }
    private void help(TreeNode root, int n) {
        if (root == null) {
            return;
        }
        if (root.right != null && root.left != null || root.right != null && root.left == null) {
            if (result.size() == n) {
                result.add(root.right.val);
            }
        }
        if (root.right == null && root.left != null) {
            if (result.size() == n) {
                result.add(root.left.val);
            }
        }
        help(root.right, n + 1);

        help(root.left, n + 1);
    }
}

