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
    int countpath(TreeNode root, long target) {
        if (root == null) {
            return 0;
        }
        int count = 0;

        // path check based on remainder
        if (root.val == target) {
            count++;
        }
        count += countpath(root.left, target - root.val);
        count += countpath(root.right, target - root.val);

        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {
        // give chance for all nodes as starting node
        if (root == null) {
            return 0;
        }
        int count = countpath(root, targetSum);

        count += pathSum(root.left, targetSum);
        count += pathSum(root.right, targetSum);

        return count;
    }
}