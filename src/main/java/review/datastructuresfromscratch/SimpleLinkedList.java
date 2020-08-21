package main.java.review.datastructuresfromscratch;

import java.util.NoSuchElementException;


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

    public String toString()
    {
        String ret = "[ ";
        SimpleLinkedListIterator iter = new SimpleLinkedListIterator();
        while(iter.hasNext())
        {
            ret += iter.next() + " ";
        }
        ret += "]";
        return ret;
    }

    public SimpleLinkedListIterator listIterator()
    {
        return new SimpleLinkedListIterator();
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

    public static void main(String[] args)
    {
        SimpleLinkedList llOfNums = new SimpleLinkedList();
        llOfNums.addFirst(165);
        System.out.println(llOfNums.getFirst());

        llOfNums.addFirst(27);
        System.out.println(llOfNums.getFirst());

        llOfNums.addFirst(7);
        llOfNums.addFirst(22);

        Integer retrieve = (Integer) llOfNums.removeFirst();
        System.out.println("Retrieved: " + retrieve);
        System.out.print(llOfNums.getFirst());

        SimpleLinkedListIterator iter = llOfNums.listIterator();
        while(iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        SimpleLinkedListIterator iter2 = llOfNums.listIterator();
        iter2.next();
        iter2.add(100);
        iter2.next();
        iter2.add(200);
        System.out.println(llOfNums);
    }
}
