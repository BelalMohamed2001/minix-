package Functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
Course CS = new Course("CS");
Instructor Ali = new Instructor(1,"Ali",CS);
String Content = "This is Chapter 1 of CS";
String Exam = "CS is Strands for ? , Computer Science , Calatur , Calculater , Career";
    @Test
    void AddContent()
    {
        assertEquals(true,Ali.AddContent(CS,Content));
    }

    @Test
    void AddExam()
    {
        assertEquals(true,Ali.AddExam(CS,Exam));
    }
}