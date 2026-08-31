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

 //insertion is correct but form unbalanced BST


class Solution {
      TreeNode BST(int[] nums,int l,int r){
     if(l>r){
        return null;
     }

      int mid=l+((r-l)>>1);
      TreeNode nn=new TreeNode(nums[mid]);

      nn.left=BST(nums,l,mid-1);
      nn.right=BST(nums,mid+1,r);

      return nn;
  }
    public TreeNode sortedArrayToBST(int[] nums) {
        int l=0;
        int r=nums.length-1;
         return  BST(nums,l,r);
    }
}