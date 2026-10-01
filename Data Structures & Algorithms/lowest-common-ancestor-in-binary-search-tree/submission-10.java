class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if we reach the end of a branch, or find p or q
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If p is in one subtree and q is in the other, root is the LCA
        if (left != null && right != null) {
            return root;
        }

        // Otherwise, return whichever node was found (left or right)
        return left != null ? left : right;
    }
}