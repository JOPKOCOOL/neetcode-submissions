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
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        help(root, 0);
        return result;
    }
    
    private void help(TreeNode root, int n) {
        if (root == null) {
            return;
        }
        try {
            result.get(n).add(root.val);
        } catch (IndexOutOfBoundsException e) {
            result.add(new ArrayList<>());
            result.get(n).add(root.val);
        }
        help(root.left, n + 1);
        help(root.right, n + 1);
    }
}
