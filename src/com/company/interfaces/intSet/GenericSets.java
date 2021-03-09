package com.company.interfaces.intSet;

interface GenericSet<E> {

    public void add(E element);

    public boolean remove(E element);

    public boolean isEmpty();

    public boolean contains(E element);

    public Iterator<E> iterator();

    public void addAll(GenericSet<E> other);

    public void removeAll(GenericSet<E> other);

    public boolean contains(GenericSet<E> other);
}
