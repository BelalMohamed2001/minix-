package Functional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student Ahmed = new Student(1,"Ahmed");
    Course Math = new Course("Math");
    double Grade = 50.0;
    @Test
    void RegisteringCourse() {
        assertEquals(true,Ahmed.RegisteringCourse(Math));

    }

    @Test
    void TakingExam() {
        Ahmed.StudentCourses.add(Math);
        assertEquals(true,Ahmed.TakingExam(Math,Grade));
    }
}