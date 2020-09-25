package com.company.hw6.bo;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Person o) {
        int value = this.lastName.compareTo(o.lastName);

        if (value != 0) {
            return value;
        }

        value = this.firstName.compareTo(o.firstName);
        return value;
    }
}
