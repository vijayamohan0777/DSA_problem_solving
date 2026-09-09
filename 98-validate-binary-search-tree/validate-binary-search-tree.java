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
    boolean valid(TreeNode root, long up, long lb) {
        if (root == null) {
            return true;
        }

        if (root.val >= up || root.val <= lb) {
            return false;
        }

        return valid(root.left, root.val, lb) && valid(root.right, up, root.val);

    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
}