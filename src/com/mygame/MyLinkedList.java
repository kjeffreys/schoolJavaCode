package com.mygame;

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
