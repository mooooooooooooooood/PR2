package PR2.tut08.course;

public class Course {
    private int courseID;
    private String name;
    private int credits;
    private Department department;
    private Semester semester;
    //Constructor
    public Course (int courseID, String name, int credits, Department department, Semester semester) throws Exception {
        if (!this.isValidCourseID(courseID)) throw new Exception("Invalid course ID!");
        this.courseID = courseID;

        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;

        if (!this.isValidCredit(credits)) throw new Exception("Invalid credits!");
        this.credits = credits;
        this.department = department;
        this.semester = semester;
    }

    //getter && setter

    public int getCourseID() {
        return this.courseID;
    }

    public void setCourseID(int courseID) throws Exception {
        if (!this.isValidCourseID(courseID)) throw new Exception("Invalid course ID!");
        this.courseID = courseID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (!this.isValidName(name)) throw new Exception("Invalid name!");
        this.name = name;
    }

    public int getCredits() {
        return this.credits;
    }

    public void setCredits(int credits) throws Exception {
        if (!this.isValidCredit(credits)) throw new Exception("Invalid credits!");
        this.credits = credits;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Semester getSemester() {
        return this.semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    //validator
    public boolean isValidCourseID(int courseID) {
        return courseID > 0;
    }

    public boolean isValidName (String name) {
        return name != null && name != " " && name != "";
    }

    public boolean isValidCredit (int credits) {
        return credits > 0;
    }

    @Override
    public String toString() {
        return "Course[" +
                "courseID=" + this.getCourseID() +
                ",name=" + this.getName() +
                ",credits=" + this.getCredits() +
                ",department=" + this.getDepartment() +
                ",semester=" + this.getSemester() +
                "]";
    }
}
