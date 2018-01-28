package com.tkb.algorithm;


import com.tkb.algorithm.link_list.LinkList;
import com.tkb.algorithm.link_list.Node;
public class Main {

    public static void main(String[] args) {

        int [] values = {1,2,3,3,4,5,5,6};
        Node head = null;
        for(int value : values){
            head = LinkList.insertNode(head,value);
        }
        LinkList.removeDuplicate(head);
        LinkList.displayNodes(head);




        //Following code is for BinaryTree
        /*int [] values = {3,5,2,1,4,6,7};
        Node root = null ;

        // Add node
        for (int value : values){
            root = BinaryTree.addNode(root,value);
        }
        System.out.print("Height of the node: "+BinaryTree.getHeightOfTree(root));

        System.out.print("\nLabel Order Traversal: ");
        BinaryTree.labelOrderTraversal(root);

        System.out.print("\nIn Order Traversal: ");
        BinaryTree.inOrderTraversal(root);

        System.out.print("\nPre Order Traversal: ");
        BinaryTree.preOrderTraversal(root);

        System.out.print("\nPost Order Traversal: ");
        BinaryTree.postOrderTraversal(root);*/
    }
}
