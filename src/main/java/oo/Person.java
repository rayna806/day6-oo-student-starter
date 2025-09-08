package oo;

import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final int age;

    public Person(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s.I am 18 years %d.",name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
