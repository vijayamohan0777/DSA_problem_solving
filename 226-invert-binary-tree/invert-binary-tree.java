
class Solution {
    public TreeNode mirror( TreeNode root){
        if(root == null){
            return null;
        }

        mirror(root.left);
        mirror(root.right);

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
      return   mirror(root);
    }
}