package oo.step4;

import oo.Klass;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    // when belongsTo give teacher does not teach the class then return false
    @Test
    public void should_return_false_when_belongsTo_given_teacher_does_not_teach_the_class() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        //When
        //Then
        assertFalse(teacher.belongsTo(klass));
    }
    // when belongsTo give teacher teach the class then return true
    @Test
    public void should_return_true_when_belongsTo_given_teacher_teach_the_class() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(1);
        //When
        teacher.assignTo(klass);
        //Then
        assertTrue(teacher.belongsTo(klass));
    }
    // when belongsTo given teacher teach multiple classes then return true
    @Test
    public void should_return_true_when_belongsTo_given_teacher_teach_multiple_classes() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        //When
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        //Then
        assertTrue(teacher.belongsTo(klass1));
        assertTrue(teacher.belongsTo(klass2));
    }
    //when introduce given teacher teach one class then return message
    @Test
    public void should_return_a_message_when_introduce_givern_teacher_teach_one_class() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);

        Klass klass = new Klass(1);
        teacher.assignTo(klass);
        //Then
        String message = teacher.introduce();
        assertEquals("My name is Jerry.I am 21 years old.I am a teacher.I teach class 1.", message);
    }
    // when introduce given teacher teach multiple classes then return message
    @Test
    public void should_return_a_message_when_introduce_givern_teacher_teach_multiple_class() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Klass klass = new Klass(2);
        Klass klass2 = new Klass(3);
        teacher.assignTo(klass);
        teacher.assignTo(klass2);
        //Then
        String message = teacher.introduce();
        assertEquals("My name is Jerry.I am 21 years old.I am a teacher.I teach class 2,3.", message);
    }
    // when isTeaching given student not in the class taught by teacher then should return false
    @Test
    public void should_return_false_when_isTeaching_given_student_not_in_the_class_taught_by_teacher() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Student student = new Student(1, "Tom", 20);
        Klass klass = new Klass(2);
        teacher.assignTo(klass);
        assertFalse(teacher.isTeaching(student));
        // when isTeaching given student in the class taught by teacher then return true
    }
    @Test
    public void should_return_true_when_isTeaching_given_student_in_the_class_taught_by_teacher() {
            //Given
            Teacher teacher = new Teacher(1, "Jerry", 21);
            Student student = new Student(1, "Tom", 20);
            Klass klass = new Klass(1);
            student.join(klass);
            teacher.assignTo(klass);
            assertTrue(teacher.isTeaching(student));
    }
    // when isTeaching given student in any class taught by teacher then return true
    @Test
    public void should_return_true_when_isTeaching_given_student_in_any_class_taught_by_teacher() {
        //Given
        Teacher teacher = new Teacher(1, "Jerry", 21);
        Student student = new Student(1, "Tom", 20);
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        student.join(klass2);
        teacher.assignTo(klass1);
        teacher.assignTo(klass2);
        assertTrue(teacher.isTeaching(student));
    }
}
