package com.company.interfaces.stringStack;

public class Demo {

    public static void transferStacks(StringStack dst, StringStack src){
        while (!src.isEmpty()) {
            dst.push(src.pop());
        }
    }

    public static void main(String[] args) {
        StringStack arrayStack = new StringStackArray();
        StringStack listStack = new StringStackList();
        arrayStack.push("hello");
        arrayStack.push("now");
        arrayStack.push("gone");
        listStack.push("stonks");
        System.out.println(arrayStack);
        System.out.println(listStack);
        transferStacks(listStack,arrayStack);
        assert arrayStack.isEmpty();
        assert !listStack.isEmpty();
        System.out.println(listStack);
    }
}
