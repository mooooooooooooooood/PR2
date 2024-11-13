package PR2.tut08.course;

import PR2.tut08.person.Student;

import java.util.List;

public interface StudentManageable {
    public void addStudent(Student student);
    public void removeStudent(Student student);
    public void updateStudent(Student student);
    public List<Student> getEnrolledStudents();
}
