package com.company.interfaces.people;

class NumberComparator implements PersonComparator {
    @Override
    public int compareTo(Person p1, Person p2) {
        int number1 = Integer.parseInt(p1.getPhonenumber());
        int number2 = Integer.parseInt(p2.getPhonenumber());
        return Integer.compare(number2,number1);
    }
}
