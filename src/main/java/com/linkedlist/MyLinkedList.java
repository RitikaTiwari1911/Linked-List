package com.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;

    public MyLinkedList(){
        this.head=null;
        this.tail=null;
    }

    //method for adding new node
        public void add(INode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null){
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //ability to print nodes
    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode newNode){
        if(this.head == null){
            this.head=newNode;
        }
        if(this.tail==null){
            this.tail=newNode;
        }
        else{
            this.tail.setNext(newNode);
            this.tail=newNode;
        }

    }

    //method to add a node between two nodes
    public void insert(INode myNode, INode newNode){
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
}
