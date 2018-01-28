package com.tkb.algorithm.link_list;

public class Node {
    int value;
    Node next;

    Node(int value){
        this.value = value;
        next = null;
    }

    public String toString (){
        return "value: "+value;
    }
}
