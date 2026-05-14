package com.practice.dsa.linked_list_algorithm;

public class CircularLinkedList extends LinkedListDemo {

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addLast(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            newest.next = head;
            head = newest;
        } else {
            newest.next = tail.next;
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    @Override
    public void addFirst(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            newest.next = newest;
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            tail.next = newest;
            head = newest;
        }
        size++;
    }

    @Override
    public void addAny(int e, int position) {
        Node newest = new Node(e, null);
        Node p = head;
        int i = 1;
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        newest.next = p.next;
        p.next = newest;
        size++;
    }

    @Override
    @SuppressWarnings("java:S106")
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        int e = head.element;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return e;
    }

    @Override
    @SuppressWarnings("java:S106")
    public int removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        int e = tail.element;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node p = head;
            while (p.next != tail) {
                p = p.next;
            }
            p.next = head;
            tail = p;
        }
        size--;
        return e;
    }

    // position is 1-based (matches addAny): 1 = first, size = last.
    @Override
    @SuppressWarnings("java:S106")
    public int removeAny(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return -1;
        }
        if (position == 1) {
            return removeFirst();
        }
        if (position == size) {
            return removeLast();
        }
        Node p = head;
        int i = 0;
        while (i < position - 2) {
            p = p.next;
            i++;
        }
        int e = p.next.element;
        p.next = p.next.next;
        size--;
        return e;
    }

    @Override
    @SuppressWarnings("java:S106")
    public void display() {
        Node p = head;
        int i = 0;
        while (i < size) {
            System.out.print(p.element + " ");
            p = p.next;
            i++;
        }
        System.out.println();
    }

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        CircularLinkedList l = new CircularLinkedList();
        l.addLast(7);
        l.addLast(9);
        l.addLast(11);
        l.addLast(21);
        l.addLast(24);
        l.addFirst(5);
        l.addAny(15, 4);
        System.out.print("full list is -> ");
        l.display();
        System.out.println("removed element is -> " + l.removeFirst());
        System.out.println("removed last element is -> "+l.removeLast());
        l.display();
        System.out.println("removed 3rd element -> "+l.removeAny(3));
        l.display();
        System.out.println("Size: " + l.size);
    }


}
