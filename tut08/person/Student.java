package PR2.tut08.person;

import PR2.tut08.course.Course;

import java.util.List;

public class Student extends Person{
    private int studentID;
    private List<Course> enrolledCourses;
    private double gpa;
    //Constructor
    public Student(){}
    public Student(int studentID, double gpa, int id, String name, String dateOfBirth) throws Exception{
        super(id ,name, dateOfBirth);
        if (!this.isValidStudentID(studentID)) throw new Exception("Invalid student ID!");
        this.studentID = studentID;

        if (!this.isValidGPA(gpa)) throw new Exception("Invalid gpa!");
        this.gpa = gpa;
    }
    public Student(int studentID, double gpa, int id, String name, String dateOfBirth, String email, String tel, String address) throws Exception{
        super(id ,name, dateOfBirth, email, tel, address);
        if (!this.isValidStudentID(studentID)) throw new Exception("Invalid student ID!");
        this.studentID = studentID;

        if (!this.isValidGPA(gpa)) throw new Exception("Invalid gpa!");
        this.gpa = gpa;
    }

    //getter && setter
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) throws Exception {
        if (!this.isValidStudentID(studentID)) throw new Exception("Invalid student ID!");
        this.studentID = studentID;
    }

    public List<Course> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) throws Exception{
        if (!this.isValidGPA(gpa)) throw new Exception("Invalid gpa!");
        this.gpa = gpa;
    }

    //validator
    public boolean isValidStudentID (int studentID) {
        return studentID > 0;
    }

    public boolean isValidGPA (double gpa) {
        return gpa > 0.0 && gpa <= 4.0;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + "," +
                "studentID=" + this.getStudentID() +
                ",gpa=" + this.getGpa() +
                ']';
    }
}
