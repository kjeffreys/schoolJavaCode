package com.review.datastructuresfromscratch;

import java.util.NoSuchElementException;
import java.util.Collection;
import java.util.Arrays;


/**
 * Simple LList class without all the methods of the java.util.LinkedList class.
 */
public class SimpleLinkedList
{
    private Node first;

    /**
     * Constructor for empty linked list.
     */
    public SimpleLinkedList()
    {
        first = null;
    }

    /**
     * Returns the first element in the linked list
     * @return first element in the linked list.
     */
    public Object getFirst()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    /**
     * Adds an element to the front of the linked list.
     * NOTE: This is required for O(1) insertion with SINGLY linked list.
     * @param obj the element to add
     */
    public void addFirst(Object obj)
    {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.next = first;
        first = newNode;
    }

    /**
     * Removes the first element in the linked list.
     * @return the removed node from the linked list (first element)
     */
    public Object removeFirst()
    {
        if(first == null)
        {
            throw new NoSuchElementException();
        }
        Object obj = first.data;
        first = first.next;
        return obj;
    }

    public int size()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public boolean contains(Object o)
    {
        return false;
    }

    public SimpleLinkedListIterator iterator()
    {
        return new SimpleLinkedListIterator();
    }

    public Object[] toArray()
    {
        return new Object[0];
    }

    public boolean add(Object o)
    {
        return false;
    }

    public boolean remove(Object o)
    {
        return false;
    }

    public boolean addAll(Collection c)
    {
        return false;
    }

    public boolean addAll(int index, Collection c)
    {
        return false;
    }

    public void clear()
    {

    }

    public Object get(int index)
    {
        return null;
    }

    public Object set(int index, Object element)
    {
        return null;
    }

    public void add(int index, Object element)
    {

    }

    public Object remove(int index)
    {
        return null;
    }

    public int indexOf(Object o)
    {
        return 0;
    }

    public int lastIndexOf(Object o)
    {
        return 0;
    }

    public SimpleLinkedListIterator listIterator()
    {
        return new SimpleLinkedListIterator();
    }


    public SimpleLinkedList subList(int fromIndex, int toIndex)
    {
        return null;
    }

    public boolean retainAll(Collection c)
    {
        return false;
    }

    public boolean removeAll(Collection c)
    {
        return false;
    }

    public boolean containsAll(Collection c)
    {
        return false;
    }

    public Object[] toArray(Object[] a)
    {
        return new Object[0];
    }

    class SimpleLinkedListIterator implements SimpleListIterator
    {
        private Node curr;
        private Node prev;

        public SimpleLinkedListIterator()
        {
            curr = null;
            prev = null;
        }

        public Object next()
        {
            if(!hasNext())
            {
                throw new NoSuchElementException();
            }
            prev = curr;
            if(curr == null)
            {
                curr = first;
            }
            else
            {
                curr = curr.next;
            }

            return curr.data;
        }

        public boolean hasNext()
        {
            if(curr == null)
            {
                return (first != null);
            }
            else
            {
                return curr.next != null;
            }
        }

        public void remove()
        {
            if(prev == curr)
            {
                throw new IllegalStateException();
            }
            if(curr == first)
            {
                removeFirst();
            }
            else
            {
                prev.next = curr.next;
            }

            curr = prev;
        }

        public void set(Object obj)
        {
            if(curr == null)
            {
                throw new NoSuchElementException();
            }
            curr.data = obj;
        }

        public void add(Object obj)
        {
            if(curr == null)
            {
                addFirst(obj);
                curr = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = obj;
                newNode.next = curr.next;
                curr.next = newNode;
            }
            prev = curr;
        }
    }
}
