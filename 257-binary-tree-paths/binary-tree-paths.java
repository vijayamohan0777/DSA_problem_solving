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

    List<String> ans=new ArrayList<>();
     
     void treepath(TreeNode root, String str){
        if(root == null){
            return ;
        }

        if(str.length() == 0){
            str=str+root.val;
        }else{
            str=str+"->"+root.val;
        }

        if(root.left == null && root.right == null){
              ans.add(str);
              return ;
        }
        
            treepath(root.left,str);
            treepath(root.right,str);

     }
    public List<String> binaryTreePaths(TreeNode root) {
        String str="";
     treepath(root,str);

     return ans;
    }
}