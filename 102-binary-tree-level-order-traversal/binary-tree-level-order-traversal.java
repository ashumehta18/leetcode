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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();

        if(root == null) return l1;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
             ArrayList<Integer> list = new ArrayList<>();
            int len = q.size();

            for(int i = 0 ;i<len;i++){
                
                 TreeNode curr = q.poll();

                 list.add(curr.val);
                if(curr.left != null) q.add(curr.left);
                
                if(curr.right != null) q.add(curr.right);
            }
            l1.add(list);

        }
        return l1;
    }
}