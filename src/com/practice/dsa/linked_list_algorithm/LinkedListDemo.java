package com.practice.dsa.linked_list_algorithm;

public class LinkedListDemo {
    /** List node: value {@code e}, successor {@code n}. */
    static class Node {
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

    /** @return number of elements */
    public int length() {
        return size;
    }

    /** @return {@code true} if size is 0 */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Appends {@code e} at the tail. */
    public void addLast(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    /** Inserts {@code e} at the head. */
    public void addFirst(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }
        size++;
    }

    /**
     * Inserts {@code e} at 1-based {@code position}.
     * Prints and no-ops if position is invalid (see implementation).
     */
    public void addAny(int e, int position) {
        if (position <= 0 || position >= size) {
            System.out.println("Invalid position");
        }
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

    /** @return removed head value, or {@code -1} if empty */
    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        }
        int e = head.element;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return e;
    }

    /** @return removed tail value, or {@code -1} if empty; O(n) for singly linked list */
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
            p.next = null;
            tail = p;
        }
        size--;
        return e;
    }

    /** @return value at 0-based {@code position}, or {@code -1} if invalid */
    public int removeAny(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return -1;
        }
        if (position == 0) {
            return removeFirst();
        } else {
            Node p = head;
            int i = 0;
            while (i < position - 1) {
                p = p.next;
                i++;
            }
            int e = p.next.element;
            p.next = p.next.next;
            size = size - 1;
            return e;
        }

    }

    /** @return 0-based index of {@code key}, or {@code -1} if absent */
    public int search(int key) {
        Node p = head;
        int index = 0;
        while (p != null) {
            if (p.element == key)
                return index;
            p = p.next;
            index++;
        }
        return -1;
    }

    /** Prints elements from head to tail, separated by {@code -->}. */
    public void display() {
        Node p = head;
        while (p != null) {
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
        System.out.println("Size: " + l.length());
        l.addLast(8);
        l.addLast(3);
        l.display();
        System.out.println("Size: " + l.length());
        l.addFirst(9);
        l.addAny(20, 3);
        l.display();
        System.out.println("size:" + l.length());
        System.out.println("index is -> " + l.search(20));
        l.display();
        System.out.println("removed element is -> " + l.removeFirst());
        l.display();
        System.out.println("last element removed -> " + l.removeLast());
        l.display();
        System.out.println("removed element is " + l.removeAny(4));
        l.display();
    }
}
