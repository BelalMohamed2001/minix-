package Functional;
import javax.swing.*;
import java.util.ArrayList;

public class Student {
    public static  int CourseCount;
    private int StudentId;
    private String StudentName ;
    private double StudentGPA;
     public ArrayList<Course> StudentCourses ;

    public Student() {
    }

    public Student(int studentId, String studentName) {
        StudentId = studentId;
        StudentName = studentName;
        StudentCourses = new ArrayList<>();
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentGPA(double studentGPA) {
        StudentGPA = studentGPA;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public double getStudentGPA() {
        return StudentGPA;
    }

    public boolean RegisteringCourse (Course course)
    {
        if(this.StudentCourses.contains(course))
            JOptionPane.showMessageDialog(null, "This course is registered", "Student", JOptionPane.INFORMATION_MESSAGE);
        else
            this.StudentCourses.add(course);

        return this.StudentCourses.contains(course);
    }
    public boolean TakingExam (Course course,double Grade)
    {
        CourseCount =  StudentCourses.indexOf(course);
        StudentCourses.set(CourseCount ,course).setGrade(Grade);
        StudentGPA += Grade ;
        if(StudentCourses.contains(course))
            return true;
        else
            return false;
    }

    public boolean IsRegistered (Course Course)
    {
        return StudentCourses.contains(Course);
    }
    public double GenerateGPA()
    {
        return this.StudentGPA ;
    }
}
