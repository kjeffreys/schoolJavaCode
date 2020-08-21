package test;

import org.junit.Test;

import main.java.review.datastructuresfromscratch.SimpleLinkedList;

public class TestSimpleLinkedList
{
    @Test
    public void testEmptyList()
    {
        SimpleLinkedList myList = new SimpleLinkedList();
        myList.getFirst();
    }
}
