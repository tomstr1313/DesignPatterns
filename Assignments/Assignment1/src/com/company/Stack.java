package com.company;

public class Stack <T> extends DoublyLinkedList<T>{
    public int count;

    public T peek(){

        T data = headNode.getNodeData();
        return data;

    }

    public void push(T t){
        this.addFirst(t);
        count++;

    }

    public T pop(){

        T data = headNode.getNodeData();
        this.removeFirst();
        count--;
        return data;
    }
}
