https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/?envType=daily-question&envId=2025-02-23
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
public class Solution {
    private int preIndex = 0;
    private Map<Integer, Integer> postIndexMap = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            postIndexMap.put(postorder[i], i);
        }
        return construct(preorder, postorder, 0, preorder.length - 1);
    }

    private TreeNode construct(int[] preorder, int[] postorder, int left, int right) {
        if (left > right) return null;
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if (left == right) return root;
        
        int postIndex = postIndexMap.get(preorder[preIndex]);
        
        root.left = construct(preorder, postorder, left, postIndex);
        root.right = construct(preorder, postorder, postIndex + 1, right - 1);
        
        return root;
    }
}
