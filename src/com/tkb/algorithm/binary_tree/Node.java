package com.tkb.algorithm.binary_tree;

public class Node {
    int key;
    String value;
    Node leftChild;
    Node rightChild;

    Node(int key, String value){
        this.key = key;
        this.value = value;
        this.leftChild = this.rightChild = null;
    }

    public String toString(){
        return "Key: "+key+" Value: "+value;
    }
}
