package com.company.deque;

import com.company.stack.ArrayStack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayDeque implements Deque {
    ArrayStack arrayStack = new ArrayStack();
    private Object[] array = new Object[10];
    private int head;
    private int tail;
    private int size;


    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addFirst("1");
        arrayDeque.addFirst("2");
        arrayDeque.addFirst("3");
        arrayDeque.addFirst("4");
        arrayDeque.addFirst("5");
        arrayDeque.addLast("6");
        arrayDeque.addLast("7");
        System.out.println(Arrays.toString(arrayDeque.array));
        arrayDeque.removeFirst();
        System.out.println(Arrays.toString(arrayDeque.array));
        arrayDeque.removeLast();
        arrayDeque.removeLast();
        arrayDeque.removeFirst();
        arrayDeque.removeFirst();
        System.out.println(Arrays.toString(arrayDeque.array));


    }


    @Override
    public boolean addFirst(Object o) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null && array[i + 1] != null) {
                array[i] = o;
                head = i;
                size++;
                return true;
            }
            if (size == 0) {
                array[i] = o;
                head = i;
                size++;
                return true;
            }
            if (head == 0) {
                for (int i1 = array.length - 1; i1 > 0; i1--) {
                    if (array[i1] == null) {
                        array[i1] = o;
                        head = i1;
                        size++;
                        return true;
                    }
                }
            }
        }
        return false;
    }


    @Override
    public boolean addLast(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (size == 0) {
                return false;
            }
            if (array[i] == null && array[i - 1] != null) {
                array[i] = o;
                tail = i;
                size++;
                return true;
            }
            if (i == array.length - 1) {
                for (int i1 = 0; i1 < array.length; i1++) {
                    if (array[i1] == null) {
                        array[i1] = o;
                        tail = i1;
                        size++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean offerFirst(Object o) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null && array[i + 1] != null) {
                array[i] = o;
                head = i;
                size++;
                return true;
            }
            if (size == 0) {
                array[i] = o;
                head = i;
                size++;
                return true;
            }
            if (head == 0) {
                for (int i1 = array.length - 1; i1 > 0; i1--) {
                    if (array[i1] == null) {
                        array[i1] = o;
                        head = i1;
                        size++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean offerLast(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (size == 0) {
                return false;
            }
            if (array[i] == null && array[i - 1] != null) {
                array[i] = o;
                tail = i;
                size++;
                return true;
            }
            if (i == array.length - 1) {
                for (int i1 = 0; i1 < array.length; i1++) {
                    if (array[i1] == null) {
                        array[i1] = o;
                        tail = i1;
                        size++;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Object removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Object o = array[head];
        array[head] = null;
        head++; size--;
        return o;
    }

    @Override
    public Object removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Object o = array[tail];
        array[tail] = null;
        size--; tail--;
        return o;
    }

    @Override
    public Object pollFirst() {
        if (size == 0) return null;
        Object o = array[head];
        array[head] = null;
        head++; size--;
        return o;
    }

    @Override
    public Object pollLast() {
        if (size == 0) return null;
        Object o = array[tail];
        array[tail] = null;
        size--; tail--;
        return o;
    }

    @Override
    public Object elementFirst() {
        if (size == 0) throw new NoSuchElementException();
        return array[head];
    }

    @Override
    public Object elementLast() {
        if (size == 0) throw new NoSuchElementException();
        return array[tail];

    }

    @Override
    public Object peekFirst() {
        if (size == 0) throw new NoSuchElementException();
        return array[head];
    }

    @Override
    public Object peekLast() {
        if (size == 0) throw new NoSuchElementException();
        return array[tail];
    }







    @Override
    public boolean add(Object o) {
        if (addFirst(o)) {
            return true;
        }
        if (addLast(o)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean offer(Object o) {
        if (offerLast(o)) return true;
        return false;
    }

    @Override
    public Object remove() {
        if (size == 0) throw new NoSuchElementException();
        return pollFirst();
    }

    @Override
    public Object poll() {
        return pollFirst();
    }

    @Override
    public Object element() {
        return elementFirst();
    }

    @Override
    public boolean empty() {
        return arrayStack.empty();
    }

    @Override
    public Object peek() {
        return peekFirst();
    }

    @Override
    public Object pop() {
        return pollLast();
    }

    @Override
    public Object push(Object element) {
        return addLast(element);
    }

    @Override
    public int search(Object element) {
        return arrayStack.search(element);
    }
}
