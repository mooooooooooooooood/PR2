package PR2.tut10.ex1and2;
import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private double mark;
    private String faculty;
    //Constructor
    public Student(){
    }
    public Student(String name, double mark, String faculty) {
        this.name = name;
        this.mark = mark;
        this.faculty = faculty;
    }
    //getter & setter
    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception{
        if (!isValidName(name)) throw new Exception("Invalid name");
        this.name = name;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) throws Exception{
        if (!isValidMark(mark)) throw new Exception("Invalid mark");
        this.mark = mark;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) throws Exception {
        if (!isValidFaculty(faculty)) throw new Exception("Invalid faculty");
        this.faculty = faculty;
    }
    //validator
    public boolean isValidName(String name) {
        return name != null && name != "" && name != " ";
    }

    public boolean isValidMark (double mark) {
        return mark > 0 && mark <= 10;
    }

    public boolean isValidFaculty (String faculty) {
        return faculty != null && faculty != "" && faculty != " ";
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + this.getName() +
                ",mark=" + this.getMark() +
                ",faculty=" + this.getFaculty() +
                "]" ;
    }
}
