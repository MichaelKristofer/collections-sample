package com.company.deque;

import com.company.queue.Queue;
import com.company.stack.Stack;

public interface Deque extends Queue, Stack {
    boolean addFirst(Object o);

    boolean addLast(Object o);

    boolean offerFirst(Object o);

    boolean offerLast(Object o);

    Object removeFirst();

    Object removeLast();

    Object pollFirst();

    Object pollLast();

    Object elementFirst();

    Object elementLast();

    Object peekFirst();

    Object peekLast();
}
