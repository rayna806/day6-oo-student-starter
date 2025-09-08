package oo.step3;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    // when student not join klass and isIn klass then return false
    @Test
    public void should_return_false_when_student_not_join_Klass_and_is_in_Klass() {
        Student student = new Student(1, "Tom", 20);
        Klass klass = new Klass(1);
        //student.join(klass);
        student.isIn(klass);
        assertFalse(student.isIn(klass));
    }
    // when student join klass and isIn klass then return false
    @Test
    public void should_return_true_when_student_join_Klass_and_is_in_Klass() {
        Student student = new Student(1, "Tom", 20);
        Klass klass = new Klass(1);
        student.join(klass);
        student.isIn(klass);
        assertTrue(student.isIn(klass));
    }
    // when student join two klass then return recently klass
    @Test
    public void should_return_recently_klass_when_student_join_two_klass() {
        Student student = new Student(1, "Tom", 20);
        Klass klass = new Klass(1);
        Klass klass2 = new Klass(2);
        student.join(klass);
        student.join(klass2);
        assertFalse(student.isIn(klass));
        assertFalse(student.isIn(klass2));

    }
    // when introduce a student is in a class then return message with name age and class
    @Test
    public void should_return_a_message_with_name_age_and_class_when_introduce_a_student_is_in_a_class() {
        Student student = new Student(1, "Tom", 20);
        Klass klass = new Klass(1);
        student.join(klass);
        String message = student.introduce();
        //Then
        assertEquals("My name is Tom.I am 20 years old.I am a student.I am in Klass1", message);
    }
}
