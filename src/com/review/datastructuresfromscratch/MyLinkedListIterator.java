package com.review.datastructuresfromscratch;

import java.util.ListIterator;
import java.util.NoSuchElementException;

//public class MyLinkedListIterator implements ListIterator {

public class MyLinkedListIterator {
    private Node curr;
    private Node prev;

    /*
    public MyLinkedListIterator() {
        prev = curr = null;

    }
    */
    /*
    @Override
    public boolean hasNext() {
        if(curr==null) {
            return first != null; // that symbol in idea is not equals
        }
        else {
            return curr.next != null;
        }
    }

    @Override
    public Object next() {


        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        // NOTE: hasNext() already made sure curr != null
        prev = curr;
        curr = curr.next;

        if(curr == null) {
            curr = first;
        }


        return null; // don't forget to delete this, placeholder
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public Object previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Object o) {

    }

    @Override
    public void add(Object o) {

    }

     */
}
