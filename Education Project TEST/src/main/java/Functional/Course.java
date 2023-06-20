package Functional;

public class Course {
    private String CourseName ;
    private String Content = "" ;
    private String Exam ;
    private double Grade ;
    public Course ()
    {}


    public Course(String courseName) {
        CourseName = courseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setContent(String content) {
        Content += content;
    }

    public void setExam(String exam) {
        Exam = exam;
    }

    public void setGrade(double grade) {
        Grade = grade;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getContent() {
        return Content;
    }

    public String getExam() {
        return Exam;
    }

    public double getGrade() {
        return Grade;
    }
}
