package main.java.com.dsa;

import java.util.Map;
import java.util.TreeMap;

/**
 * vertical sum of a BinaryTree
 */
public class VSumOfTree {
    private static class Node{
        private int data;
        private Node left;
        private Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }


    }
    static Node node;

    public static void vSum(Node root, Map<Integer, Integer> map, int vertical){
        if(root==null){
            return;
        }
        int data=0;
        if (map.containsKey(vertical)) {
        data=map.get(vertical);
        }
        map.put(vertical,data+root.data);
        vSum(root.left,map,vertical-1);
        vSum(root.right,map,vertical+1);

        }

        public static void main(String[] args){
        VSumOfTree tree= new VSumOfTree();
       // Tree.node= new Node(1);
            /*Tree.node.right= new Node(3);
            Tree.node.left= new Node(2);
            Tree.node.right.right= new Node(5);
            Tree.node.left.left= new Node(4);*/
            TreeMap<Integer,Integer> map= new TreeMap<>();
            VSumOfTree.node = new Node(1);
            VSumOfTree.node.left = new Node(3);
            VSumOfTree.node.right = new Node(2);
            tree.node.right.left = new Node(4);
            VSumOfTree.node.right.right = new Node(5);
            vSum(VSumOfTree.node,map,0);
            for(Map.Entry<Integer, Integer> entry: map.entrySet())
                System.out.print(+entry.getValue()+" ");

        }

}

