package com.company;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;


public class DoublyLinkedList<T> extends AbstractCollection<T> implements Iterator<T>,Collection<T>{
    public DoublyLinkedNode<T> headNode;
    public DoublyLinkedNode<T> tailNode;
    public DoublyLinkedNode<T> currentNode;
    private int count;

    public void addFirst(T nodeData){
        DoublyLinkedNode<T> tempNode = headNode;
        headNode = new DoublyLinkedNode<T>(nodeData);
        headNode.setNextNode(tempNode);
        count++;
        if(count == 1) {
            this.tailNode = this.headNode;
            currentNode = headNode;


        }else {
            tempNode.setPreviousNode(this.headNode);
            currentNode = headNode;

        }

    }

    public void addLast(T nodeData){
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<T>(nodeData);
        if(this.count==0)
        {
            this.headNode = this.tailNode = newNode;
            count++;
            //currentNode = headNode;

        }
        else
        {
            this.tailNode.setNextNode(newNode);
            newNode.setPreviousNode(tailNode);


            this.tailNode = newNode;
            count++;
           // currentNode = tailNode;
        }


    }

    public void removeFirst(){
        if(count!=0){
            headNode = headNode.getNextNode();
            count--;
            if(count==0)
                tailNode = null;
            else {
                headNode.setPreviousNode(null);
                currentNode = headNode;
            }
        }

    }

    public void removeLast(){
        if(count==1)
        {
            this.headNode = null;
            this.tailNode = null;
        }
        else
        {
            this.tailNode.getPreviousNode().setPreviousNode(null);
            this.tailNode = tailNode.getPreviousNode();
            currentNode = tailNode;
        }

    }

//Getters and Setters
    public DoublyLinkedNode<T> getHeadNode() {

        return headNode;
    }

    public DoublyLinkedNode<T> getTailNode() {
        return tailNode;
    }


    public int getCount() {
        return count;
    }

    @Override
    public boolean hasNext() {

        return currentNode != null;
    }

    @Override
    public T next() {
        if(hasNext()==false){
            return (T) "This is the end of the line";
        }else {


            T data = currentNode.getNodeData();
            currentNode = currentNode.getNextNode();
            return data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this;
    }

    @Override
    public int size() {
        return count;
    }
}