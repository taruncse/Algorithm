package com.tkb.algorithm.link_list;

public class LinkList {

    public static Node insertNode (Node head, int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return head;
        }else if(head.next == null){
            head.next = newNode;
            return head;
        }else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;

            return head;
        }
    }

    public static void displayNodes(Node head){
        while (head !=null){
            System.out.print(head.value+"\n");
            head = head.next;
        }
    }

    public static Node removeDuplicate (Node head){
        if (head ==null || head.next == null){
            return head;
        }

        if (head.value == head.next.value){
            head.next = head.next.next;
            removeDuplicate(head);
        }else {
            removeDuplicate(head.next);
        }
        return head;
    }
}
