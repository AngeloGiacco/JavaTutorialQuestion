package com.company.interfaces.people;

public class Person {
    private final String forename;
    private final String surname;
    private final String phonenumber;

    public Person(String forename, String surname, String phonenumber){
        this.forename = forename;
        this.surname = surname;
        this.phonenumber = phonenumber;
    }


    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return this.getForename()+" "+this.getSurname()+ " - "+this.getPhonenumber();
    }

}
