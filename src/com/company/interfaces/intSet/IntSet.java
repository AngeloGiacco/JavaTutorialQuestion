package com.company.interfaces.intSet;

public interface IntSet {
    // Adds the integer x to the set
    public void add(int x);

    // If the integer x belongs to the set, it is removed and 'true'
    // is returned.  Otherwise 'false' is returned
    public boolean remove(int x);

    // Returns true iff the set is empty
    public boolean isEmpty();

    // Returns true iff the set contains the integer x
    public boolean contains(int x);

    public IntSetIterator iterator();

    // Add to the set each element in 'other'
    public void addAll(IntSet other);

    // Remove from the set each element in 'other'
    public void removeAll(IntSet other);

    // Return true iff the set contains every element of 'other'
    public boolean contains(IntSet other);
}
