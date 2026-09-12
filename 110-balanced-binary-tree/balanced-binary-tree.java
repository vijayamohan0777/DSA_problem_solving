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

    int isbalance(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = isbalance(root.left);
        if (left == -1) {
            return -1;
        }

        int right = isbalance(root.right);
        if (right == -1) {
            return -1;
        }

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return 1 + Math.max(left, right);
    }

    public boolean isBalanced(TreeNode root) {
        if (isbalance(root) == -1) {
            return false;
        }

        return true;
    }
}