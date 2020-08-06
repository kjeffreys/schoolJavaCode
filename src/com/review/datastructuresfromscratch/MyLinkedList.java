package com.review.datastructuresfromscratch;

public class MyLinkedList {
    private Node first;

    public MyLinkedList() {
        first = null;
    }


    class Node {
        Object data;
        Node next;
    }
}
