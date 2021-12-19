package com.company.list;

public class ArrayList implements List {
    private Object[] arr = new Object[10];
    private int size;

    @Override
    public void add(Object o) {
        arr[size++] = o;
    }

    @Override
    public Object remove(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                Object o = arr[i];
                for (int i1 = i; i1 < arr.length - 1; i1++) {
                    arr[i1] = arr[i1 + 1];
                }
                size--;
                return o;
            }
        }
        return null;
    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public void add(int index, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                if (arr.length - 1 - i >= 0) {
                    System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                }
                arr[i] = o;
                size++;
                break;
            }
        }
    }

    @Override
    public Object set(int index, Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                Object o1 = arr[i];
                arr[i] = o;
                return o1;
            }
        }
        return null;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        int size1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                size1++;
            }
        }
        Object[] arr1 = new Object[size1];
        for (int i = 0, g = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr1[g++] = arr[i];
            }
        }
        return arr1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return true;
            }
        }
        return false;
    }
}
