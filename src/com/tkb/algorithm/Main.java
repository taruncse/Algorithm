package com.tkb.algorithm;

import com.tkb.algorithm.binary_tree.BinaryTree;
import com.tkb.algorithm.binary_tree.Node;

public class Main {

    public static void main(String[] args) {

        int [] values = {3,5,2,1,4,6,7};
        Node root = null ;

        for (int value : values){
            root = BinaryTree.addNode(root,value);
        }
        System.out.print(BinaryTree.getHeightOfTree(root)+"");

    }
}
