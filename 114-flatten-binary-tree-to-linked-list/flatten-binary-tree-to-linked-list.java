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

//  class Solution {

//     List<Integer> prelist = new ArrayList<>();

//     void preorder(TreeNode root) {

//         if (root == null) {
//             return;
//         }

//         prelist.add(root.val);
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public void flatten(TreeNode root) {
//         if (root == null) {
//             return;
//         }
//         preorder(root);
//         TreeNode temp = root;
//         for (int i = 1; i < prelist.size(); i++) {
//             temp.left = null;
//             TreeNode nn = new TreeNode(prelist.get(i));
//             temp.right = nn;
//             temp = temp.right;
//         }
//     }
// }

// my solution is O(n)

//this is O(h)  --> optimal
//use reverse preorder
class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {

        if (root == null) {
            return ;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        //important
        prev = root;
    }
}