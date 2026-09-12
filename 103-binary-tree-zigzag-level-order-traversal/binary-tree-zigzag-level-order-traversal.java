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
    List<List<Integer>> ans=new ArrayList<>();
    
    void solve(TreeNode root, Queue<TreeNode> q){
        int level=0;
         while(!q.isEmpty()){

            int size=q.size();
            List<Integer> list=new ArrayList<>();
         if(level % 2==0){
            for(int i=0;i<size;i++){
                 TreeNode temp=q.poll();
                  list.add(temp.val);
                   
                if(temp.left !=null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }
            ans.add(new ArrayList<>(list));
         }else{

            Stack<Integer> stack=new Stack<>();

            for(int i=0;i<size;i++){
                 TreeNode temp=q.poll();
                  stack.push(temp.val);
                   
                if(temp.left !=null){
                    q.offer(temp.left);
                }
                if(temp.right != null){
                    q.offer(temp.right);
                }
            }

                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }

             ans.add(new ArrayList<>(list));
         }
            
             level++;
         }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();

        if(root == null){
            return ans;
        }
        q.offer(root);
       
       solve(root,q);
        return ans;
    }
}