package com.company.deque;

public class LinkedDeque implements Deque{
    private Node root;
    private int size;
    private int tail;
    private int head;


    @Override
    public boolean addFirst(Object o) {

        return false;
    }

    @Override
    public boolean addLast(Object o) {
        return false;
    }

    @Override
    public boolean offerFirst(Object o) {
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        return false;
    }

    @Override
    public Object removeFirst() {
        return null;
    }

    @Override
    public Object removeLast() {
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }

    @Override
    public Object elementFirst() {
        return null;
    }

    @Override
    public Object elementLast() {
        return null;
    }

    @Override
    public Object peekFirst() {
        return null;
    }

    @Override
    public Object peekLast() {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object push(Object element) {
        return null;
    }

    @Override
    public int search(Object element) {
        return 0;
    }

    private static class Node {
        Node next;
        Object object;

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", object=" + object +
                    '}';
        }

        public Node(Node next, Object object) {
            this.next = next;
            this.object = object;
        }
    }

}
