package com.company.queue;

import com.company.list.List;

import java.util.NoSuchElementException;

public class ArrayQueue implements Queue{
    private Object[] array = new Object[10];
    private int size;

    @Override
    public boolean add(Object o) {
        if (size == array.length) return false;
        array[size++] = o;
        return true;
    }

    @Override
    public boolean offer(Object o) {
        if (size == array.length) throw new IllegalStateException();
        array[size++] = o;
        return false;
    }

    @Override
    public Object remove() {
        if (size == 0) throw new NoSuchElementException();
        Object o = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return o;
    }

    @Override
    public Object poll() {
        if (size == 0) return null;
        Object o = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return o;
    }

    @Override
    public Object element() {
        if (size == 0) throw new NoSuchElementException();
        return array[size];
    }

    @Override
    public Object peek() {
        if (size == 0) return null;
        return array[size];
    }
}
