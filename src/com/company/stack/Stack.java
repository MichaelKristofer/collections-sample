package com.company.stack;

public interface Stack {

    boolean empty();

    Object peek();

    Object pop();

    Object push(Object element);

    int search(Object element);

}
