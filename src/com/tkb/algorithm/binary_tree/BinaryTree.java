package com.tkb.algorithm.binary_tree;

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

}
