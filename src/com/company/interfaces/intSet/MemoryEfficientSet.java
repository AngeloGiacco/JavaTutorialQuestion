package com.company.interfaces.intSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemoryEfficientSet extends AbstractIntSet{

    private final Set<Integer> intSet;

    public MemoryEfficientSet() {
        this.intSet = new HashSet<>();
    }

    @Override
    public void add(int x) {
        this.intSet.add(x);
    }

    @Override
    public boolean remove(int x) {
        if (this.intSet.contains(x)) {
            this.intSet.remove(x);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.intSet.isEmpty();
    }

    @Override
    public boolean contains(int x) {
        return this.intSet.contains(x);
    }

    public IntSetIterator iterator() {
        return new IntSetIterator() {
            Iterator<Integer> iter = intSet.iterator();
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public int next() {
                return iter.next();
            }
        };
    }
}
