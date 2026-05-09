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
    int prei ;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

       prei = 0;
       for(int i = 0 ;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
       return Arr(preorder,0,inorder.length-1);
    }
    public TreeNode Arr(int[] pre , int left,int right){
        if(left>right) return null;
        int rootv = pre[prei++];
        TreeNode root = new TreeNode(rootv);
        int mid = map.get(rootv);

        root.left = Arr(pre,left,mid-1);
        root.right = Arr(pre,mid+1,right);

        return root;


    }
}