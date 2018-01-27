package com.tkb.algorithm.binary_tree;

public class BinaryTree {

    public Node addNode(Node root, int key,String value){
        if (root == null){
            return new Node(key,value);
        }else {
            Node newNode;
            if (key>=root.key){
                newNode  = addNode(root.rightChild,key,value);
                root.leftChild = newNode;
            }else {
                newNode  = addNode(root.leftChild,key,value);
                root.rightChild = newNode;
            }

            return root;
        }
    }

}
