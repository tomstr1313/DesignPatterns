package com.company;

public class Queue<T> extends DoublyLinkedList<T> {


    public int count;
    public void enqueue(T t){
        this.addLast(t);
        count++;
    }

    public T dequeue(){
        T data = headNode.getNodeData();
        this.removeFirst();
        count--;
        return data;
    }

    public T peek(){

        T data = headNode.getNodeData();
        return data;
    }

}
