package com.company.interfaces.stringStack;

public class GenericStackArray<E> implements GenericStack<E>{
    private final E[] stack;
    private int pointer;

    public GenericStackArray(){
        this.stack = (E[]) new Object[100];
        this.pointer = 0;
    }

    public void push(E element) {
        if (pointer == 99){
            throw new IllegalArgumentException("stack full");
        } else {
            stack[pointer] = element;
            pointer++;
        }
    }

    public E pop() {
        if (pointer == 0){
            throw new IllegalArgumentException("stack empty");
        } else {
            return stack[pointer-- - 1];
        }
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public StackIterator iterator() {
        return new StackIterator() {
            private int iteratorPointer = 0;
            public boolean hasNext() {
                return iteratorPointer < pointer;
            }
            public E next() {
                return stack[iteratorPointer++];
            }
        };
    }
}
