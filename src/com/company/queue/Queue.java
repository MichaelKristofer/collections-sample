package com.company.queue;

public interface Queue {
    boolean add(Object o);

    boolean offer(Object o);

    Object remove();

    Object poll();

    Object element();

    Object peek();
}
