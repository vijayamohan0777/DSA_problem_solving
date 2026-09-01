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
    public void traversal(TreeNode root, PriorityQueue<Integer> min){
        if(root==null){
            return ;
        }
            min.add(root.val);
           traversal(root.left,min);
           traversal(root.right,min);
    }

    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>();   
           traversal( root ,min);
              
              for(int i=0;i<k-1;i++){
                min.poll();
              }
              return min.peek();
    }
}