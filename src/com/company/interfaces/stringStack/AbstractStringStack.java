package com.company.interfaces.stringStack;

abstract class AbstractStringStack implements StringStack {

    @Override
    public String toString() {
        StringStackIterator i = this.iterator();
        StringBuilder sb = new StringBuilder();
        while (i.hasNext()) {
            String s = i.next();
            sb.append(s + ", ");
        }
        return sb.toString();
    }

}
