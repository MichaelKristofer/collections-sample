package com.company.list;

public interface List {
    void add(Object o);

    Object remove(int index);

    Object get(int index);

    void add(int index, Object o);

    Object set(int index, Object o);

    boolean contains(Object o);

    Object[] toArray();

    int size();

    boolean isEmpty();
}
