package com.company.interfaces.people;

class TwoTieredComparator implements PersonComparator {
    private final PersonComparator comparator1;
    private final PersonComparator comparator2;

    public TwoTieredComparator(PersonComparator comparator1,PersonComparator comparator2){
        this.comparator1 = comparator1;
        this.comparator2 = comparator2;
    }

    @Override
    public int compareTo(Person person, Person other) {
        int firstComparison = comparator1.compareTo(person,other);
        if (firstComparison != 0){
            return firstComparison;
        } else {
            return comparator2.compareTo(person,other);
        }
    }
}
