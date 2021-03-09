package com.company.interfaces.stringStack;

public interface GenericStack<E> {
    public void push(E element);

    public E pop();

    public boolean isEmpty();

    public String toString();
}
