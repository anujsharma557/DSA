package main.java.com.dsa;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:  LeetCode #105 -Construct Binary Tree from Preorder and Inorder Traversal
 * Use hashmap to store all inorder map inorder to avoid iteration multiple time
 */
public class ConstructBinaryTreeFromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        TreeNode root= new TreeNode();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return  build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }

    public TreeNode build(int[] preorder,int preorderStart,int preorderEnd,int[] inorder,int inorderStart,int inorderEnd,Map<Integer,Integer>map){
        if(preorderEnd<preorderStart ||  inorderEnd<inorderStart){
            return null;
        }
        int data = preorder[preorderStart];
        int offset=map.get(preorder[preorderStart]);
        TreeNode root= new TreeNode(data);
        root.left = build(preorder,preorderStart+1,preorderStart+offset-inorderStart,inorder,inorderStart,offset-1,map);
        root.right = build(preorder,preorderStart+offset-inorderStart+1,preorderEnd,inorder,offset+1,inorderEnd,map);
        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
       TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
