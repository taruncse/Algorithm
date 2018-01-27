package com.tkb.algorithm.binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static Node addNode(Node root, int value){
        if (root == null){
            return new Node(value);
        }else {
            Node newNode;
            if (value>=root.value){
                newNode  = addNode(root.rightChild,value);
                root.rightChild = newNode;
            }else {
                newNode  = addNode(root.leftChild,value);
                root.leftChild = newNode;
            }

            return root;
        }
    }
    public static int getHeightOfTree(Node root){
        if(root == null){
            return -1;
        }
        int leftHeight = getHeightOfTree(root.leftChild);
        int righHeight = getHeightOfTree(root.rightChild);

        if (leftHeight>righHeight){
            return leftHeight+1;
        }else {
            return righHeight+1;
        }
    }

    public static void labelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while ( ! queue.isEmpty()) {
            Node n = queue.remove();
            System.out.print(n.value + " ");
            if (n.leftChild != null) {
                queue.add(n.leftChild);
            }
            if (n.rightChild != null) {
                queue.add(n.rightChild);
            }
        }
    }

    public static void inOrderTraversal (Node root){
        if (root!=null){
            inOrderTraversal(root.leftChild);
            System.out.print(root.value+" ");
            inOrderTraversal(root.rightChild);
        }
    }
    public static void preOrderTraversal (Node root){
        if (root!=null){
            System.out.print(root.value+" ");
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.rightChild);
        }
    }

    public static void postOrderTraversal (Node root){
        if (root!=null){
            postOrderTraversal(root.leftChild);
            postOrderTraversal(root.rightChild);
            System.out.print(root.value+" ");

        }
    }
}
