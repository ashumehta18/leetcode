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
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int cur = q.size();
            List<Integer> l2 = new ArrayList<>();
            for(int i = 0 ;i<cur;i++){
                TreeNode ele = q.poll();

                l2.add(ele.val);

                if(ele.left != null) q.add(ele.left);
                if(ele.right != null) q.add(ele.right);
            }
            res.add(l2);
        }
        return res;
        
    }
}