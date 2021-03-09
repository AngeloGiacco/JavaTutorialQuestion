package com.company.interfaces.stringStack;

import java.util.ArrayList;
import java.util.List;

public class GenericStackList<E> implements GenericStack<E>{
    private final List<E> stack;
    private int pointer;

    public GenericStackList(){
        this.stack = new ArrayList<>();
        this.pointer = 0;
    }

    public void push(E element) {
        if (pointer == 99){
            throw new IllegalArgumentException("stack full");
        } else {
            stack.add(element);
            pointer++;
        }
    }

    public E pop() {
        if (pointer == 0){
            throw new IllegalArgumentException("stack empty");
        } else {
            return stack.remove(pointer-- - 1);
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
                return stack.get(iteratorPointer++);
            }
        };
    }
}
