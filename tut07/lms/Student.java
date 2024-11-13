package PR2.tut07.lms;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private List<Course> enrolledCourses = new ArrayList<Course>();

    //Constructor
    public Student(int studentID,String name, String dateOfBirth) throws Exception{
        if (!this.isValidStudentID(studentID)) throw new Exception("Invalid studentID!");
        this.studentID = studentID;

        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;

        if (!this.isValidDateOfBirth(dateOfBirth)) throw new Exception("Invalid date of birth!");
        this.dateOfBirth = dateOfBirth;
    }

    //getters & setters
    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) throws Exception{
        if (!this.isValidStudentID(studentID)) throw new Exception("Invalid studentID!");
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception{
        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws Exception{
        if (!this.isValidDateOfBirth(dateOfBirth)) throw new Exception("Invalid date of birth!");
        this.dateOfBirth = dateOfBirth;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) throws Exception{
        if (!this.isValidGPA(gpa)) throw new Exception("Invalid gpa!");
        this.gpa = gpa;
    }

    public List getEnrolledCourses() {
        return this.enrolledCourses;
    }

    public void setEnrolledCourses(List enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    //validators
    public boolean isValidStudentID (int studentID) {
        return studentID >= 1;
    }

    public boolean isValidName (String name) {
        return (name.trim() != "") && (name.trim() != " ") && (name != null) && (name.trim().length() <= 50) ;
    }

    public boolean isValidDateOfBirth(String dateOfBirth) {
        return (dateOfBirth != null) && (dateOfBirth.trim().length() <= 10);
    }

    public boolean isValidGPA (double gpa) {
        return (gpa >= 0.0) && (gpa <= 10.0);
    }

    public boolean repOK() {
        return this.isValidStudentID(this.getStudentID()) && this.isValidName(this.getName()) && this.isValidDateOfBirth(this.getDateOfBirth());
    }

    @Override
    public String toString() {
        return "Student[ID=" + this.getStudentID() + ",name=" + this.getName() + ",date of birth=" + this.getDateOfBirth() + "]";
    }

    public int compareTo(Student s) {
        return s.getName().compareTo(this.getName());
    }
}
