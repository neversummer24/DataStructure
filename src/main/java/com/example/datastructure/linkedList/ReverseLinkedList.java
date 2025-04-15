package com.example.datastructure.linkedList;

public class ReverseLinkedList {
    //内部类Node
    public static class Node{
        private int data;
        private Node next;

        public Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

    //创建节点的方法
    public static Node createNode(int data) {
        return new Node(data, null);
    }


    //反转单向链表方法1   返回反转后的链表的头结点
    public Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = null;  // 新的头
        Node pointer = head;  // 指针
        while (pointer.next != null) {
            Node temp = pointer.next;
            pointer.next = newHead;  //point从1移动成2
            newHead = pointer;//头从null移动成1
            pointer = temp;
        }
        return newHead;
    }


    //递归反转
    public Node recursionReverse(Node head) {//返回以head为头节点的反转链表
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursionReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


}
