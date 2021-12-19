package com.company.stack;

import java.util.EmptyStackException;

public class ArrayStack implements Stack{

    private Object[] array = new Object[10];
    private int size;

    @Override
    public boolean empty() {
        return size == 0;
    }

    @Override
    public Object peek() {
        if (size == 0) throw new EmptyStackException();
        return array[size-1];
    }

    @Override
    public Object pop() {
        if (size == 0) throw new EmptyStackException();
        Object o = array[size - 1];
        array[size - 1] = null;
        size--;
        return o;
    }

    @Override
    public Object push(Object element) {
        array[size++] = element;
        return element;
    }

    @Override
    public int search(Object element) {
        for (int i = size - 1; i > 0; i--) {
            if (array[i].equals(element)) {
                return (size - 1) - i;
            }
        }
        return -1;
    }
}
