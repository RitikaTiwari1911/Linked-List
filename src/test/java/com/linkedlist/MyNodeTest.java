package com.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyNodeTest {
    @Test
    public void given3Numbers_WhenLinked_ShouldPass_LinkedListTest(){
        MyNode<Integer>myFirstNode=new MyNode<>(56);
        MyNode<Integer>mySecondNode=new MyNode<>(30);
        MyNode<Integer>myThirdNode=new MyNode<>(70);

        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(mySecondNode);

        boolean result = myFirstNode.getNext().equals(mySecondNode)&&
                         mySecondNode.getNext().equals(myThirdNode);

        Assert.assertTrue(result);
    }

}
