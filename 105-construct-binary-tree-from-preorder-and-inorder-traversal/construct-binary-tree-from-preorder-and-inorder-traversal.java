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

    int preindex = 0;

    TreeNode build(int[] preorder, int[] inorder, int left, int right) {
        // there is no element in left in inoreder return null

        if (left > right) {
            return null;
        }

        int rootvalue = preorder[preindex++];

        TreeNode root = new TreeNode(rootvalue);

        int index = left;
        while (inorder[index] != rootvalue) {
            index++;
        }

        root.left = build(preorder, inorder, left, index - 1);
        root.right = build(preorder, inorder, index + 1, right);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int left = 0;
        int right = inorder.length - 1;
        return build(preorder, inorder, left, right);
    }
}