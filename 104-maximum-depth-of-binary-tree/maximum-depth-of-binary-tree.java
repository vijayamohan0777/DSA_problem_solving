
class Solution {
    
    public static int HeightofTree(TreeNode root){
   if(root == null){
    return 0;
   }

   int left=HeightofTree(root.left);
   int right=HeightofTree(root.right);

   return Math.max(left,right)+1;
}

    public int maxDepth(TreeNode root) {
      return   HeightofTree(root);
    }
}