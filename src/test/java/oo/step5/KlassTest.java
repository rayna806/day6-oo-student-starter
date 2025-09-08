package oo.step5;

import oo.Klass;
import oo.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KlassTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }
    // when isLeader given assign leader of student is in class then return t
    @Test
    public void should_return_true_when_isLeader_given_assign_leader_of_student_is_in_class() {
        Student student = new Student(1, "Jerry", 21);
        Klass klass = new Klass(1);
        student.join(klass);
        klass.assignLeader(student);
        //assertTrue(klass.isLeader(student));
        assertTrue(student.isLeader());
    }
    // when assign leader given student is not in class then print prompt message
    @Test
    public void should_return_print_message_when_isLeader_given_assign_leader_of_student_is_not_in_class() {
        Student student = new Student(1, "Jerry", 21);
        Klass klass = new Klass(1);
        klass.assignLeader(student);
        assertTrue(outputStream.toString().contains("It is not one of us."));
    }
}
