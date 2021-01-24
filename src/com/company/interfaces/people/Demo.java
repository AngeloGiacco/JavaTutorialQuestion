package com.company.interfaces.people;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static Person findMin(Set<Person> people, PersonComparator comparator) {
        Person result = null;
        for (Person person : people) {
            if (result == null || comparator.compareTo(result,person) <= 0){
                result = person;
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Person angelo = new Person("angelo","giacco","1234");
        Person emilia = new Person("emilia","giacco","0000");
        Person helen = new Person("helen", "whitehurst", "9999");
        Person tony = new Person("tony","field","12345678");
        Person angelo3 = new Person("angelo","field","5678");
        Person angelo4 = new Person("angelo","field","5676");
        Person angelo2 = new Person("angelo","giacco","2234");

        Set<Person> people = new HashSet<>();
        people.add(angelo);
        people.add(emilia);
        people.add(helen);
        people.add(tony);
        people.add(angelo3);
        people.add(angelo2);
        people.add(angelo4);

        System.out.println(findMin(people,new ForenameComparator()));
        System.out.println(findMin(people,new SurnameComparator()));
        System.out.println(findMin(people,new NumberComparator()));

        TwoTieredComparator surnameThenForenameComparator = new TwoTieredComparator(new SurnameComparator(), new ForenameComparator());
        System.out.println(findMin(people,surnameThenForenameComparator));
        TwoTieredComparator forenameThenNumberComparator = new TwoTieredComparator(new ForenameComparator(), new NumberComparator());
        TwoTieredComparator rightAssocSurnameThenForenameThenNumber = new TwoTieredComparator(new SurnameComparator(), forenameThenNumberComparator);
        TwoTieredComparator leftAssocSurnameThenForenameThenNumber = new TwoTieredComparator(surnameThenForenameComparator, new NumberComparator());
        System.out.println(findMin(people,rightAssocSurnameThenForenameThenNumber));
        System.out.println(findMin(people,leftAssocSurnameThenForenameThenNumber));
    }
}
