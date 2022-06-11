package main.java.com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #102 - Binary Tree Level Order Traversal
 * good solution but not best
 */
public class LevelOrderTravertsal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null){
            return res;
        }
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            res.add(new ArrayList<Integer>());
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                res.get(level).add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            level++;
        }
        return res;
    }


    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
         this.left = left;
          this.right = right;
     }
  }
}
