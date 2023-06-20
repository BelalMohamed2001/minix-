package GUI;
import Functional.Course;
import Functional.Instructor;
import Functional.Student;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUIFrames extends JFrame implements ActionListener {
    static Course Physics = new Course("Physics");
    static Course OS = new Course("Operating System");
    static Course Algo = new Course("Algorithms");
    static Course Graphics = new Course("Graphics");
    static Student Sayed = new Student(1,"Sayed");
    static Student Ashraf = new Student(2,"Ashraf");
    static Student Noor = new Student(3,"Noor");
    static ArrayList<Student> Students = new ArrayList<>();
    static ArrayList<Student> Students2 = new ArrayList<>();
    static Instructor Ahmed = new Instructor(1,"Ahmed",Physics);
    static Instructor Mohamed = new Instructor(2,"Mohamed",OS);
    static Instructor Ali = new Instructor(3,"Ali",Algo);
    static Instructor Asmaa = new Instructor(3,"Asmaa",Graphics);

 //Main Frame Component Initialization
 JButton Student ,Instructor ;
    JPanel HomePanel;

//Student Information Component Initialization
 JLabel StudentName, StudentCourse ,Studentgrade, StudentGPA;
  JTextField StudentNameT, StudentCourseT,StudentgradeT, StudentGPAT;
 JPanel StuInfoPanel;
//Instructor Component Initialization
JComboBox combo;
    JButton ContentB3,ExamB3 ,SearchForStudent;
    JTextArea Text ;
    JTextField StudentIdText ,  Exam ,c1,c2,c3,Answer;
    JLabel StudentIdLabel, Content ,Ex, Ans;
    JPanel InstructorPanel;

//Course Content Component Initialization
    static JTextArea CourseCon ;
    JPanel CourseContentPanel;

//Student Component Initialization
    JComboBox combostd;
    JRadioButton C1 , C2 , C3, C4 ;
    ButtonGroup choices ;
    JButton  Exams , Register ,Submit ,CourseContent ;
    JTextField StudentIdText2, Question ;
    JLabel StudentIdLabel2 , Courses;
    JPanel StudentPanel ;
    public void ShowCourseContent() {
        CourseCon = new JTextArea();
        CourseCon.setEditable(false);
        CourseContentPanel = new JPanel();
        /////////////////////////////////////////////////////////////
        this.setTitle("Student Information");
        this.setSize(800, 600);
        CourseContentPanel.setSize(800,600);
        this.setVisible(true);
        CourseContentPanel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        CourseContentPanel.setLayout(null);
        CourseContentPanel.setBackground(Color.PINK);
        this.setResizable(false);
        this.setLocation(700, 200);
        this.add(CourseContentPanel);
        //////////////////////////////////////////////////////////
        CourseCon.setBounds(80,20,600,500);
        CourseContentPanel.add(CourseCon);


    }

    public void ShowStudentInformation() {
        StudentName = new JLabel("Student Name");
        StudentCourse = new JLabel("Student Courses");
        Studentgrade = new JLabel("Student Grades");
        StudentGPA = new JLabel("Student GPA");
        StudentNameT= new JTextField();
        StudentCourseT= new JTextField();
        StudentgradeT= new JTextField();
        StudentGPAT= new JTextField();
        StuInfoPanel = new JPanel();
        StudentNameT.setEditable(false);
        StudentCourseT.setEditable(false);
        StudentgradeT.setEditable(false);
        StudentGPAT.setEditable(false);
        /////////////////////////////////////////////////////////////
        this.setTitle("Student Information");
        this.setSize(800, 600);
        StuInfoPanel.setSize(800,600);
        this.setVisible(true);
        StuInfoPanel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        StuInfoPanel.setLayout(null);
        StuInfoPanel.setBackground(Color.PINK);
        this.setResizable(false);
        this.setLocation(700, 200);
        this.add(StuInfoPanel);
        //////////////////////////////////////////////////////////
        StudentName.setBounds(10, 40, 100, 30);
        StuInfoPanel.add(StudentName);
        StudentCourse.setBounds(10, 80, 100, 30);
        StuInfoPanel.add(StudentCourse);
        Studentgrade.setBounds(10, 130, 100, 30);
        StuInfoPanel.add(Studentgrade);
        StudentGPA.setBounds(10, 170, 100, 30);
        StuInfoPanel.add(StudentGPA);
        StudentNameT.setBounds(150, 40, 400, 30);
        StuInfoPanel.add(StudentNameT);
        StudentCourseT.setBounds(150, 80, 400, 30);
        StuInfoPanel.add(StudentCourseT);
        StudentgradeT.setBounds(150, 130, 400, 30);
        StuInfoPanel.add(StudentgradeT);
        StudentGPAT.setBounds(150, 170, 400, 30);
        StuInfoPanel.add(StudentGPAT);
        Ahmed.GetStudentInfo(studentflag,Integer.parseInt(stuId),StudentNameT,StudentCourseT,StudentgradeT,StudentGPAT);

    }
    public void ShowInstructorFrame(String course1 ,String course2 , String course3 , String course4) {

        ContentB3 = new JButton("Add Content");
        ExamB3= new JButton("Add Exam");
        SearchForStudent = new JButton("Search For Student");
        StudentIdText = new JTextField();
        Text = new JTextArea();
        Exam = new JTextField();
        c1 = new JTextField();
        c2 = new JTextField();
        c3 = new JTextField();
        Answer= new JTextField();
        StudentIdLabel = new JLabel("Student Id");
        Content = new JLabel("Content");
        Ex = new JLabel("Exam Question");
        Ans = new JLabel("Answer");
        InstructorPanel = new JPanel();
        combo = new JComboBox();
        /////////////////////////////////////////////////////////////
        this.setTitle("Instructor");
        this.setSize(800, 600);
        InstructorPanel.setSize(800,600);
        this.setVisible(true);
        InstructorPanel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        InstructorPanel.setLayout(null);
        InstructorPanel.setBackground(Color.PINK);
        this.setResizable(false);
        this.setLocation(700, 200);
        this.add(InstructorPanel);
        //////////////////////////////////////////////////////////
        StudentIdLabel.setBounds(10, 40, 100, 10);
        InstructorPanel.add(StudentIdLabel);
        StudentIdText.setBounds(80, 35, 150, 20);
        InstructorPanel.add(StudentIdText);
        SearchForStudent.setBounds(305, 32, 150, 30);
        InstructorPanel.add(SearchForStudent);
        combo.setBounds(80, 70, 150, 30);
        combo.addItem(course1);
        combo.addItem(course2);
        combo.addItem(course3);
        combo.addItem(course4);
        InstructorPanel.add(combo);
        ContentB3.setBounds(80, 340, 150, 30);
        InstructorPanel.add(ContentB3);
        ExamB3.setBounds(80, 380, 150, 30);
        InstructorPanel.add(ExamB3);
        Content.setBounds(400, 70, 350, 30);
        InstructorPanel.add(Content);
        Text.setBounds(400, 100, 350, 100);
        InstructorPanel.add(Text);
        Ex.setBounds(400, 250, 350, 30);
        InstructorPanel.add(Ex);
        Exam.setBounds(400, 290, 350, 50);
        InstructorPanel.add(Exam);
        c1.setBounds(400, 350, 350, 30);
        InstructorPanel.add(c1);
        c2.setBounds(400, 400, 350, 30);
        InstructorPanel.add(c2);
        c3.setBounds(400, 450, 350, 30);
        InstructorPanel.add(c3);
        Ans.setBounds(400, 490, 350, 30);
        InstructorPanel.add(Ans);
        Answer.setBounds(400, 520, 350, 30);
        InstructorPanel.add(Answer);
        SearchForStudent.addActionListener(this);
        ContentB3.addActionListener(this);
        ExamB3.addActionListener(this);
    }
    public void ShowStudentFrame(String course1 ,String course2 , String course3 , String course4) {
        Submit  =new JButton("Submit");
        CourseContent = new JButton("Course Content");
        Register =new JButton("Register");
        StudentIdText2 = new JTextField();
        Question = new JTextField();
        Courses =  new JLabel("Courses");
        Exams = new JButton("Exams");
        StudentIdLabel2 = new JLabel("Student Id");
        combostd = new JComboBox();
        StudentPanel = new JPanel();
        C1 = new JRadioButton("");
        C2 = new JRadioButton("");
        C3 = new JRadioButton("");
        C4 = new JRadioButton("");
        choices = new ButtonGroup();
        /////////////////////////////////////////////////////////////
        this.setTitle("Student");
        this.setSize(800, 600);
        StudentPanel.setSize(800,600);
        this.setVisible(true);
        StudentPanel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        StudentPanel.setLayout(null);
        StudentPanel.setBackground(Color.PINK);
        this.setResizable(false);
        this.setLocation(700, 200);
        this.add(StudentPanel);
        //////////////////////////////////////////////////////////
        StudentIdLabel2.setBounds(10, 40, 100, 10);
        StudentPanel.add(StudentIdLabel2);
        StudentIdText2.setBounds(80, 35, 150, 20);
        StudentPanel.add(StudentIdText2);
        Register.setBounds(305, 15, 150, 50);
        StudentPanel.add(Register);
        CourseContent.setBounds(305, 80, 150, 50);
        StudentPanel.add(CourseContent);
        Courses.setBounds(10, 80, 150, 50);
        StudentPanel.add(Courses);
        combostd.setBounds(100, 80, 150, 50);
        combostd.addItem(course1);
        combostd.addItem(course2);
        combostd.addItem(course3);
        combostd.addItem(course4);
        StudentPanel.add(combostd);
        Exams.setBounds(305, 150, 150, 50);
        StudentPanel.add(Exams);
        Question.setBounds(10, 210, 600, 30);
        StudentPanel.add(Question);
        Question.setEditable(false);
        C1.setBounds(10, 250, 600, 30);
        choices.add(C1);
        StudentPanel.add(C1);
        C2.setBounds(10, 290, 600, 30);
        choices.add(C2);
        StudentPanel.add(C2);
        C3.setBounds(10, 330, 600, 30);
        choices.add(C3);
        StudentPanel.add(C3);
        C4.setBounds(10, 370, 600, 30);
        choices.add(C4);
        StudentPanel.add(C4);
        Submit.setBounds(305, 420, 150, 50);
        StudentPanel.add(Submit);
        Register.addActionListener(this);
        Submit.addActionListener(this);
        Exams.addActionListener(this);
        CourseContent.addActionListener(this);
    }

    public void ShowHomeFrame() {
        Student = new JButton("Student");
        Instructor = new JButton("Instructor");
        HomePanel = new JPanel();
        /////////////////////////////////////////////////////////////
        this.setTitle("Home");
        this.setSize(800, 600);
        HomePanel.setSize(800,600);
        this.setVisible(true);
        HomePanel.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        HomePanel.setLayout(null);
        HomePanel.setBackground(Color.PINK);
        this.setResizable(false);
        this.setLocation(700, 200);
        this.add(HomePanel);
        //////////////////////////////////////////////////////////

        Student.setBounds(305, 300, 150, 50);
        HomePanel.add(Student);
        Instructor.setBounds(305, 200, 150, 50);
        HomePanel.add(Instructor);
        Student.addActionListener(this);
        Instructor.addActionListener(this);
    }


public static Student studentflag = new Student();
    public static Course courseflag = new Course();
    public static String stuId ;
    public static int registerflag =0 ;
    public static int examflag =0 ;
    static int cliclcounter = 0 ;
    static int cliclcounter2 = 0 ;
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == Instructor) {
            new GUIFrames().ShowInstructorFrame(Physics.getCourseName(),OS.getCourseName(),Algo.getCourseName(),Graphics.getCourseName());
        }

        if (e.getSource() == Student) {
            new GUIFrames().ShowStudentFrame(Physics.getCourseName(),OS.getCourseName(),Algo.getCourseName(),Graphics.getCourseName());
        }

        if (e.getSource() == Submit) {

                if (!C1.isSelected() && !C2.isSelected() && !C3.isSelected() && !C4.isSelected())
                    JOptionPane.showMessageDialog(null, "Please Select Answer", "Student", JOptionPane.INFORMATION_MESSAGE);
                else {
                    String select = combostd.getSelectedItem().toString();
                    String answer = choices.getSelection().getActionCommand();
                    String[] split = {" "};
                    if (Physics.getCourseName().equals(select)) {
                        courseflag = Physics;
                        split = Physics.getExam().split(",");
                    } else if (OS.getCourseName().equals(select)) {
                        courseflag = OS;
                        split = OS.getExam().split(",");
                    } else if (Algo.getCourseName().equals(select)) {
                        courseflag = Algo;
                        split = Algo.getExam().split(",");
                    } else if (Graphics.getCourseName().equals(select)) {
                        courseflag = Graphics;
                        split = Graphics.getExam().split(",");
                    }

                    if (answer.equals(split[4])) {
                        studentflag.TakingExam(courseflag, 60.0);
                        JOptionPane.showMessageDialog(null, "Good Answer", "Student", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        studentflag.TakingExam(courseflag, 0.0);
                        JOptionPane.showMessageDialog(null, "Wrong Answer", "Student", JOptionPane.INFORMATION_MESSAGE);
                    }

                }

            }



        if (e.getSource() == Exams) {
            if (examflag == 0)
                JOptionPane.showMessageDialog(null, "Exam not added yet", "Student", JOptionPane.INFORMATION_MESSAGE);
            else {
                if (registerflag == 1) {
                    String select = combostd.getSelectedItem().toString();
                    if (Physics.getCourseName().equals(select)) {
                        if(studentflag.IsRegistered(Physics)){
                        String[] split = Physics.getExam().split(",");
                        Question.setText(split[0]);
                        C1.setText(split[4]);
                        C1.setActionCommand(split[4]);
                        C2.setText(split[2]);
                        C2.setActionCommand(split[2]);
                        C3.setText(split[1]);
                        C3.setActionCommand(split[1]);
                        C4.setText(split[3]);
                        C4.setActionCommand(split[3]);}

                        else
     JOptionPane.showMessageDialog(null, "Regist Course Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

                    } else if (OS.getCourseName().equals(select)) {
                        if(studentflag.IsRegistered(OS)) {
                            String[] split = OS.getExam().split(",");
                            Question.setText(split[0]);
                            C1.setText(split[4]);
                            C1.setActionCommand(split[4]);
                            C2.setText(split[2]);
                            C2.setActionCommand(split[2]);
                            C3.setText(split[1]);
                            C3.setActionCommand(split[1]);
                            C4.setText(split[3]);
                            C4.setActionCommand(split[3]);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Regist Course Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

                    } else if (Algo.getCourseName().equals(select)) {
                        if(studentflag.IsRegistered(Algo)) {
                            String[] split = Algo.getExam().split(",");
                            Question.setText(split[0]);
                            C1.setText(split[4]);
                            C1.setActionCommand(split[4]);
                            C2.setText(split[2]);
                            C2.setActionCommand(split[2]);
                            C3.setText(split[1]);
                            C3.setActionCommand(split[1]);
                            C4.setText(split[3]);
                            C4.setActionCommand(split[3]);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Regist Course Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

                    } else if (Graphics.getCourseName().equals(select)) {
                        if(studentflag.IsRegistered(Algo)) {
                            String[] split = Graphics.getExam().split(",");
                            Question.setText(split[0]);
                            C1.setText(split[4]);
                            C1.setActionCommand(split[4]);
                            C2.setText(split[2]);
                            C2.setActionCommand(split[2]);
                            C3.setText(split[1]);
                            C3.setActionCommand(split[1]);
                            C4.setText(split[3]);
                            C4.setActionCommand(split[3]);
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Regist Course Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

                    }

                } else
                    JOptionPane.showMessageDialog(null, "Please Register Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

            }
        }

        if (e.getSource() == CourseContent) {
            if (registerflag == 1) {
                new GUIFrames().ShowCourseContent();
                if (combostd.getSelectedItem().toString().equals(Physics.getCourseName()))
                    CourseCon.setText(Physics.getContent());
                else if (combostd.getSelectedItem().toString().equals(OS.getCourseName()))
                    CourseCon.setText(OS.getContent());
                else if (combostd.getSelectedItem().toString().equals(Algo.getCourseName()))
                    CourseCon.setText(Algo.getContent());
                else if (combostd.getSelectedItem().toString().equals(Graphics.getCourseName()))
                    CourseCon.setText(Graphics.getContent());
            }
            else
                JOptionPane.showMessageDialog(null, "Please Register Firstly", "Student", JOptionPane.INFORMATION_MESSAGE);

        }

        if (e.getSource() == Register) {
        if (StudentIdText2.getText().isEmpty())
            JOptionPane.showMessageDialog(null, "Please Enter Student Id ", "Student", JOptionPane.INFORMATION_MESSAGE);
        else
        {
            int f2 = 0;
            Students2.add(Noor);
            Students2.add(Ashraf);
            Students2.add(Sayed);
            stuId = StudentIdText2.getText() ;
            for (int i =0 ; i < Students2.size(); i++)
                if(Students2.get(i).getStudentId()== Integer.parseInt(stuId))
                {
                    studentflag = Students2.get(i);
                    f2++;
                    break;
                }
            if(f2==1)
            {
                String select = combostd.getSelectedItem().toString();
                if (Physics.getCourseName().equals(select))
                    studentflag.RegisteringCourse(Physics);
                else if (OS.getCourseName().equals(select))
                    studentflag.RegisteringCourse(OS);
                else if (Algo.getCourseName().equals(select))
                    studentflag.RegisteringCourse(Algo);
                else if (Graphics.getCourseName().equals(select))
                    studentflag.RegisteringCourse(Graphics);
                JOptionPane.showMessageDialog(null, "Done", "Student", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "No Students Found ", "Student", JOptionPane.INFORMATION_MESSAGE);
            registerflag = 1;
        }}

        if (e.getSource() == SearchForStudent) {

            if (StudentIdText.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please Enter Student Id ", "Student Information", JOptionPane.INFORMATION_MESSAGE);
            else
            {
                int f = 0;
            Students.add(Noor);
            Students.add(Ashraf);
            Students.add(Sayed);
             stuId = StudentIdText.getText() ;
            for (int i =0 ; i < Students.size(); i++)
                if(Students.get(i).getStudentId()== Integer.parseInt(stuId))
                {
                    studentflag = Students.get(i);
                    f++;
                    break;
                }
            if(f==1)
            {
                new GUIFrames().ShowStudentInformation();
            }
            else
                JOptionPane.showMessageDialog(null, "No Students Found ", "Student Information", JOptionPane.INFORMATION_MESSAGE);

            }}
        long totalstarttime2 =0;
        long totalendtime2 =0;
        if (e.getSource() == ContentB3) {
            cliclcounter2++;
            long starttime = System.currentTimeMillis();
            totalstarttime2 += starttime ;
            if (Text.getText().isEmpty())
                JOptionPane.showMessageDialog(null, "Please Add Content ", "Add Content", JOptionPane.INFORMATION_MESSAGE);
            else
            {
                String selected = combo.getSelectedItem().toString();
                if (Physics.getCourseName().equals(selected))
                    Ahmed.AddContent(Physics, Text.getText());
                else if (OS.getCourseName().equals(selected))
                    Mohamed.AddContent(OS, Text.getText());
                else if (Algo.getCourseName().equals(selected))
                    Ali.AddContent(Algo, Text.getText());
                else if (Graphics.getCourseName().equals(selected))
                    Asmaa.AddContent(Graphics, Text.getText());
                JOptionPane.showMessageDialog(null, "Done ", "Add Content", JOptionPane.INFORMATION_MESSAGE);
                long endtime = System.currentTimeMillis();
                totalendtime2 += endtime ;
                JOptionPane.showMessageDialog(null, "Time: " + (endtime-starttime)+ " milli seconds" + "\n" + "Average Time: " + (totalendtime2-totalstarttime2)/cliclcounter2 + " milli seconds" , "Time", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        long totalstarttime =0;
        long totalendtime =0;

        if (e.getSource() == ExamB3) {
            cliclcounter++;
            long starttime = System.currentTimeMillis();
            totalstarttime += starttime ;
            if (Exam.getText().isEmpty() || c1.getText().isEmpty()|| c2.getText().isEmpty() || c3.getText().isEmpty() || Answer.getText().isEmpty()   )
                JOptionPane.showMessageDialog(null, "Please Add Complete Exam  ", "Add Content", JOptionPane.INFORMATION_MESSAGE);
            else
            {
            String selected = combo.getSelectedItem().toString();
            if(Physics.getCourseName().equals(selected)){
                Ahmed.AddExam(Physics,Exam.getText() + "," + c1.getText() + "," + c2.getText()  + "," + c3.getText()  + "," + Answer.getText() );
                examflag++;}
            else if(OS.getCourseName().equals(selected)){
                Mohamed.AddExam(OS,Exam.getText() + "," + c1.getText()  + "," + c2.getText()  + "," + c3.getText()  + "," + Answer.getText() );
                examflag++;}
            else if(Algo.getCourseName().equals(selected)){
                Ali.AddExam(Algo,Exam.getText() + "," + c1.getText()  + "," + c2.getText()  + "," + c3.getText()  + "," + Answer.getText() );
                examflag++;}
            else if(Graphics.getCourseName().equals(selected)){
                Asmaa.AddExam(Graphics,Exam.getText() + "," + c1.getText()  + "," + c2.getText()  + "," + c3.getText()  + "," + Answer.getText() );
                examflag++;}
            JOptionPane.showMessageDialog(null, "Done ", "Add Exam", JOptionPane.INFORMATION_MESSAGE);
                long endtime = System.currentTimeMillis();
                totalendtime += endtime ;
                JOptionPane.showMessageDialog(null, "Time: " + (endtime-starttime)+ " milli seconds" + "\n" + "Average Time: " + (totalendtime-totalstarttime)/cliclcounter + " milli seconds" , "Time", JOptionPane.INFORMATION_MESSAGE);

        }

        }


    }
}
