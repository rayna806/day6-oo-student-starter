package oo;

import java.util.Objects;

abstract class Person {
    private final int id;
    private final String name;
    private final int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public Person(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public abstract String introduce() ;

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
