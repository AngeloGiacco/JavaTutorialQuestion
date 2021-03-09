package com.company.interfaces.intSet;

import java.util.HashSet;
import java.util.Set;

public class MemoryEfficientGenericSet<E> implements GenericSet<E> {
    final Set<E> set;
    public MemoryEfficientGenericSet() {
        this.set = new HashSet<>();
    }

    @Override
    public void add(E element) {
        this.set.add(element);
    }

    @Override
    public boolean remove(E element) {
        if (this.set.contains(element)) {
            this.set.remove(element);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    @Override
    public boolean contains(E element) {
        return this.set.contains(element);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator() {
            java.util.Iterator<E> iter = set.iterator();
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public E next() {
                return iter.next();
            }
        };
    }

    @Override
    public void addAll(GenericSet<E> other) {
        for (Iterator<E> it = other.iterator(); it.hasNext(); ) {
            add(it.next());
        }
    }

    @Override
    public void removeAll(GenericSet<E> other) {
        for (Iterator<E> it = other.iterator(); it.hasNext(); ) {
            remove(it.next());
        }
    }

    @Override
    public boolean contains(GenericSet<E> other) {
        for (Iterator<E> it = other.iterator(); it.hasNext(); ) {
            if (!this.contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
