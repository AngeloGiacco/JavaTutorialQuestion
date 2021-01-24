package com.company.interfaces.people;

class ForenameComparator implements PersonComparator {
    @Override
    public int compareTo(Person p1, Person p2) {
        String name1 = p1.getForename();
        String name2 = p2.getForename();
        int minLength = name1.length() <= name2.length() ? name1.length() : name2.length();
        for (int i = 0; i < minLength; i++){
            int ascii1 = name1.charAt(i);
            int ascii2 = name2.charAt(i);
            if (ascii1 < ascii2) {
                return 1;
            } else if (ascii1 > ascii2) {
                return -1;
            }
        }
        return name2.length() == name1.length() ? 0 : 1;
    }
}
