package com.company.interfaces.stringStack;

public class StringStackArray extends AbstractStringStack {
    private final String[] stringStack;
    private int pointer;
    public StringStackArray(){
        this.stringStack = new String[100];
        this.pointer = 0;
    }

    public void push(String s) {
        if (pointer == 99){
            throw new IllegalArgumentException("stack full");
        } else {
            stringStack[pointer] = s;
            pointer++;
        }
    }

    public String pop() {
        if (pointer == 0){
            throw new IllegalArgumentException("stack empty");
        } else {
            return stringStack[pointer-- - 1];
        }
    }

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
                return stringStack[iteratorPointer++];
            }
        };
    }
}
