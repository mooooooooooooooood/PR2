package PR2.tut07.lms;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseID;
    private String name;
    private String description;
    private int credit;
    private List<Student> academicTranscript = new ArrayList<Student>();
    //Constructor
    public Course(int courseID, String name, int credit) throws Exception{
        if (!this.isValidCourseID(courseID)) throw new Exception("Invalid course ID!");
        this.courseID = courseID;

        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;

        if (!this.isValidCredit(credit)) throw new Exception("Invalid credit!");
        this.credit = credit;
    }

    //getter && setter
    public int getCourseID() {
        return this.courseID;
    }

    public void setCourseID(int courseID) throws Exception{
        if (!this.isValidCourseID(courseID)) throw new Exception("Invalid course ID!");
        this.courseID = courseID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception{
        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) throws Exception {
        if (!this.isValidDescription(description)) throw new Exception("Invalid description!");
        this.description = description;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) throws Exception{
        if (!this.isValidCredit(credit)) throw new Exception("Invalid credit!");
        this.credit = credit;
    }

    public List<Student> getAcademicTranscript() {
        return this.academicTranscript;
    }

    public void setAcademicTranscript(List<Student> academicTranscript) {
        this.academicTranscript = academicTranscript;
    }

    //validators
    public boolean isValidCourseID(int courseID) {
        return courseID >= 1;
    }

    public boolean isValidName(String name) {
        return (name.trim() != "") && (name.trim() != " ") && (name != null) && (name.trim().length() <= 30) ;
    }

    public boolean isValidDescription(String description) {
        return (description.trim() != "") && (description.trim() != " ") && (description != null) && (name.trim().length() <= 100) ;
    }

    public boolean isValidCredit(int credit) {
        return (credit >= 1) && (credit <= 5);
    }

    @Override
    public String toString() {
        return "Course[ID=" + this.getCourseID() + ",name=" + this.getName() + ",credit=" + this.getCredit() + "]";
    }

    public int compareTo(Course c){
        return c.getCredit() - this.getCredit();
    }
}
