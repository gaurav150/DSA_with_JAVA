package com.practice.dsa.linked_list_algorithm;

public class LinkedListDemo {
    class Node {
        int element;
        Node next;
        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedListDemo() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int e) {
        Node newest = new Node(e, null);
        if(isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    public void addFirst(int e) {
        Node newest = new Node(e,null);
        if(isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }
        size++;

    }

    public int search(int key) {
        Node p = head;
        int index = 0;
        while(p!=null) {
            if(p.element==key)
                return index;
            p = p.next;
            index = index + 1;
        }
        return -1;
    }

    public void display() {
        Node p = head;
        while(p!=null) {
            System.out.print(p.element + "-->");
            p = p.next;
        }
        System.out.println();
    }


    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        LinkedListDemo l = new LinkedListDemo();
        l.addLast(7);
        l.addLast(4);
        l.addLast(12);
        l.display();
        System.out.println("Size: "+l.length());
        l.addLast(8);
        l.addLast(3);
        l.display();
        System.out.println("Size: "+l.length());
        l.addFirst(9);
        l.display();
        System.out.println("size:"+l.length());
    }
}
