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
    List<List<Integer>> ans = new ArrayList<>();

    void solve(TreeNode root, Queue<TreeNode> q) {
        if (root == null) {
            return;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode temp = q.poll();
                list.add(temp.val);
                if (temp.left != null) {
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            ans.add(new ArrayList<>(list));
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ans;
        }
        q.offer(root);
        solve(root, q);

        return ans;
    }
}