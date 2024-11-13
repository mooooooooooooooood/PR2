package PR2.tut08.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) throws Exception {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(220303401, 3.2, 202, "Bob", "31-03-2002"));
        studentList.add(new Student(230104012, 2.5,234, "Alice", "13-02-2005"));
        studentList.add(new Student(1904020073, 3.6, 193, "John", "14-02-2001"));

        System.out.println("Sorting person by Gpa: ");
        Collections.sort(studentList, new SortByGPA());
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
