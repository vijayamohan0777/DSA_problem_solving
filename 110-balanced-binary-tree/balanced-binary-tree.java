
class Solution {
     int check(TreeNode root){
        if(root==null){
            return 0;
        }

        int l=check(root.left);
        if(l==-1){
            return -1;
        }
        int r=check(root.right);
        if(r==-1){
            return -1;
        }

        if(Math.abs(l-r) >1){
            return -1;
        }

        return Math.max(l,r)+1;
    } 
    public boolean isBalanced(TreeNode root) {
          return (check(root) !=-1) ;
    }
}