package com.company;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        //Doubly Linked List
        DoublyLinkedList<String> ddl = new DoublyLinkedList<>();

        System.out.println("Linked List Methods:");
        ddl.addFirst("Hello");
        ddl.addLast("World");
        ddl.addFirst("Hi");
        ddl.addLast("There");
        System.out.println(ddl.next());
        System.out.println(ddl.next());
        System.out.println("Items left in list: "+ddl.hasNext());
        System.out.println(ddl.next());
        System.out.println(ddl.next());
        System.out.println("Items left in list: "+ddl.hasNext());
        System.out.println("Total length of the list: "+ddl.size());
        System.out.println("\n");

        //Stack
        System.out.println("Stack Methods:");
        Stack stack = new Stack();
        stack.push("Tom");
        stack.push("Bill");
        System.out.println("Peek: "+stack.peek());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("\n");

        //Queue
        System.out.println("Queue Methods:");
        Queue q = new Queue();
        q.enqueue("Fred");
        q.enqueue("Rob");
        q.enqueue("Tyler");

        System.out.println("Peek: "+q.peek());

        System.out.println("Dequeue: "+q.dequeue());
        System.out.println("Dequeue: "+q.dequeue());
        System.out.println("Dequeue: "+q.dequeue());
    }
}
