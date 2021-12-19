package com.company.list;

import java.util.Arrays;

public class DeqLinkedList implements List {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String[] args) {
        DeqLinkedList deqLinkedList = new DeqLinkedList();
        deqLinkedList.add("1");
        deqLinkedList.add("2");
        deqLinkedList.add("3");
        deqLinkedList.add("4");
        deqLinkedList.add("5");
        deqLinkedList.add("6");
        System.out.println(Arrays.toString(deqLinkedList.toArray()));
        deqLinkedList.remove(3);
        System.out.println(Arrays.toString(deqLinkedList.toArray()));

    }
    @Override
    public void add(Object o) {
        if (isEmpty()) {
            Node node = new Node(null, null, o);
            head = node;
            tail = node;
        } else {
            Node node = new Node(null, tail, o);
            tail.next = node;
            tail = node;
        }
        size++;
    }

    @Override
    public Object remove(int index) {
        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            if (count == index - 1) {
                Object o = temp.o;
                temp.next = temp.next.next;
                size--;
                return o;
            }
            count++;
            temp = temp.next;
        }
        return null;
    }

    @Override
    public Object get(int index) { // добавить проход с конца если индекс больше половины размера
        int count = 0;
        while (head != null) {
            if (count == index) {
                return head.o;
            }
            count++;
            head = head.next;
        }
        return null;
    }

    @Override
    public void add(int index, Object o) {

    }

    @Override
    public Object set(int index, Object o) { // добавить проход с конца если индекс больше половины размера
        int count = 0;
        while (head != null) {
            if (count == index) {
                Object o1 = head.o;
                head.o = o;
                return o1;
            }
            count++;
            head = head.next;
        }
        return null;
    }

    @Override
    public boolean contains(Object o) {
        while(head != null) {
            if (head.o == o){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] all = new Object[size];
        int index = 0;
        Node head = this.head;
        while (head != null) {
            all[index++] = head.o;
                head = head.next;
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

    public static class Node {
        Node next;
        Node prev;
        Object o;

        public Node(Node next, Node prev, Object o) {
            this.next = next;
            this.prev = prev;
            this.o = o;
        }
    }
}
