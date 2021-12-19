package com.company.list;

import java.util.Arrays;

public class LinkedList implements List {
    private Node root;
    private int size;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Hello 1");
        linkedList.add("Hello 2");
        linkedList.add("Hello 3");
        linkedList.add("Hello 4");
        linkedList.add("Hello 5");
        linkedList.add("Hello 6");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.add(3, "HI");
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.remove(3);
        System.out.println(Arrays.toString(linkedList.toArray()));
    }

    @Override
    public void add(Object o) {
        Node node = new Node(null, o);
        if (isEmpty()){
            root = node;
        } else {
            Node temp = this.root;
            while (true){
                if (temp.next == null){
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
        size++;
    }

    @Override
    public Object remove(int index) {
        Node temp = this.root;
        int count = 0;
        while (temp != null) {
            if (count == index - 1) {
                temp.next = temp.next.next;
                size--;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public Object get(int index) {
        Node temp = this.root;
        int count = 0;
        while (temp != null){
            if (count == index){
                return temp.o;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void add(int index, Object o) {
        Node temp = this.root;
        int count = 0;
        while (temp != null) {
            if (count == index - 1) {
                Node node = new Node(temp.next, o);
                temp.next = node;
                size++;
            }
            count++;
            temp = temp.next;
        }
    }

    @Override
    public Object set(int index, Object o) {
        Node temp = this.root;
        int count = 0;
        while (temp != null) {
            if (count == index) {
                Object o1 = temp.o;
                temp.o = o;
                return o1;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public boolean contains(Object o) {
        Node temp = this.root;
        while (temp != null) {
            if (temp.o == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] all = new Object[size];
        Node temp = this.root;
        int index = 0;
        while (temp != null){
            all[index++] = temp.o;
            temp = temp.next;
        }
        return all;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node{
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
}
