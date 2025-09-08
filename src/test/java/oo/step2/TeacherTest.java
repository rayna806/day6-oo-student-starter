package oo.step2;

import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    // when introduce a teacher, then return a message with name and age
    @Test
    public void should_return_a_message_with_name_and_age_when_introduce_a_teacher() {
        Teacher teacher = new Teacher(1, "Jerry", 21);
        String message = teacher.introduce();
        //Then
        assertEquals("My name is Jerry.I am 21 years old.I am a teacher.", message);
    }
    // when equals two same id teacher then return true
    @Test
    public void should_return_true_when_equals_two_same_id_teacher() {
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Teacher teacher2 = new Teacher(1, "Jerry", 21);
        assert(teacher.equals(teacher2));
    }
    // when equals two different id teacher then return true
    @Test
    public void should_return_true_when_equals_two_different_id_teacher() {
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Teacher teacher2 = new Teacher(2, "Tom", 21);
        assert(!teacher.equals(teacher2));
    }
}

