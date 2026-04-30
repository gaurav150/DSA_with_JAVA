package com.practice.dsa.linked_list_algorithm;

public class ReverseLinkedListDemo {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node current = head;
        Node previous = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static int getMiddle(int length) {
        return length % 2 == 0 ? length / 2 : length / 2 + 1;
    }

    @SuppressWarnings("java:S106")
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        display(head);
        display(reverseList(head));
        LinkedListDemo l = new LinkedListDemo();
        l.addLast(7);
        l.addLast(4);
        l.addLast(12);
        l.addLast(8);
        l.addLast(3);
        l.addFirst(9);
        l.addAny(20, 3);
        l.display();
        System.out.println("Size: " + l.length());
        System.out.println("middle element -> " + (getMiddle(l.length())));
    }
}
