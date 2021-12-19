package com.company.queue;

import com.company.list.DeqLinkedList;

import java.util.Arrays;

public class LinkedQueue implements Queue {
    private Node root;
    private int size;

    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.add("Obama 1");
        linkedQueue.add("Obama 2");
        linkedQueue.add("Obama 3");
        linkedQueue.add("Obama 4");
        linkedQueue.add("Obama 5");
        System.out.println(linkedQueue);
        linkedQueue.remove();
        System.out.println(linkedQueue);
    }
    @Override
    public boolean add(Object o) {
        Node node = new Node(null, o);
        if (size == 0) {
            root = node;
        } else {
            Node temp = this.root;
            while (true) {
                if (temp.next == null) {
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(Object o) {
        Node node = new Node(null, o);
        if (size == 0) {
            root = node;
        } else {
            Node temp = this.root;
            while (true) {
                if (temp.next == null) {
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
        return true;
    }

    @Override
    public Object remove() {
        Node next = root.next;
        Object o = next.o;
        root = next;
        size--;
        return o;
    }

    @Override
    public Object poll() {
        Node next = root.next;
        Object o = next.o;
        root = next;
        size--;
        return o;
    }

    @Override
    public Object element() {
        return root;
    }

    @Override
    public Object peek() {
        return root;
    }

    private static class Node {
        Node next;
        Object o;

        public Node(Node next, Object o) {
            this.next = next;
            this.o = o;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", o=" + o +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }
}
