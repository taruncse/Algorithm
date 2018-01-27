package com.tkb.algorithm.binary_tree;

public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int  value){
        this.value = value;
        this.leftChild = this.rightChild = null;
    }

    public String toString(){
        return "Value: "+value;
    }
}
