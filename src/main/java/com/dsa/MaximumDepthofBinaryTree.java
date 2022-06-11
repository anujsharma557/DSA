package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #104 -Maximum Depth of Binary Tree
 * Fastest approach
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    public class TreeNode {
        int val;
        LevelOrderTravertsal.TreeNode left;
        LevelOrderTravertsal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, LevelOrderTravertsal.TreeNode left, LevelOrderTravertsal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
