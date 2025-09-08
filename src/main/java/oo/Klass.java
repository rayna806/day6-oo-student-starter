package oo;

import java.util.Objects;

public class Klass {
        private Integer number;

    public Klass(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public Integer getNumber() {
        return number;
    }

    public void assignLeader(Student student) {
        if(student.isIn(this)) {
            student.isLeader = true;
        }else {
            System.out.println("It is not one of us.");
        }
    }

//    public boolean isLeader(Student student) {
//        return false;
//    }
}
