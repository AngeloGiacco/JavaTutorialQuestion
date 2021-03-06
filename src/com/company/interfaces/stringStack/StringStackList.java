package com.company.interfaces.stringStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringStackList extends AbstractStringStack {
    private int pointer = 0;
    private final List<String> stringStack;

    public StringStackList(){
        this.stringStack = new ArrayList<>();
    }

    public void push(String s) {
        this.stringStack.add(s); pointer++;
    }

    public String pop(){
        if (pointer == 0) {
            throw new IllegalArgumentException("Stack empty");
        }
        return this.stringStack.remove(pointer-- - 1);
    }

    @Override
    public boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public StringStackIterator iterator() {
        return new StringStackIterator() {
            private int iteratorPointer = 0;
            public boolean hasNext() {
                return iteratorPointer < pointer;
            }
            public String next() {
                return stringStack.get(iteratorPointer++);
            }
        };
    }

}
