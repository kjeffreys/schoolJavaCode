package main.java.review.datastructuresfromscratch;

/**
 * A simple lister iterator to allow access to a position in the
 * SimpleLinkedList without needing all of the methods of the
 * java.util.ListIterator interface.
 * NOTE: This is an iterator for a singly linked list only.
 */
public interface SimpleListIterator
{
    Object next();

    boolean hasNext();

    void add(Object obj);

    void remove();

    void set(Object obj);
}
