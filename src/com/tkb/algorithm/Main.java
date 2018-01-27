package com.tkb.algorithm;

import com.tkb.algorithm.binary_tree.BinaryTree;
import com.tkb.algorithm.binary_tree.Node;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {

    public static void main(String[] args) {

        int [] values = {3,5,2,1,4,6,7};
        Node root = null ;

        // Add node
        for (int value : values){
            root = BinaryTree.addNode(root,value);
        }
        System.out.print("Height of the node: "+BinaryTree.getHeightOfTree(root)+"\n");

        BinaryTree.labelOrderTraversal(root);
        System.out.print("\n");

        BinaryTree.inOrderTraversal(root);
        System.out.print("\n");

        BinaryTree.preOrderTraversal(root);
        System.out.print("\n");

        BinaryTree.postOrderTraversal(root);
    }
}
