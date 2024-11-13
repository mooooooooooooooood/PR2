package PR2.tut08.lms;

import PR2.tut08.course.Course;
import PR2.tut08.course.Department;
import PR2.tut08.course.Semester;
import PR2.tut08.person.Student;

import java.util.Comparator;
import java.util.HashMap;

public class LMSTest {
    public static void main(String[] args) {
        // Create a LearningManagementSystem instance
        LearningManagementSystem lms = new LearningManagementSystem(new HashMap<String, Student>(), new HashMap<String, Course>(), "SP", 2024);

        // Add students
        try {
            lms.addStudent(new Student(220303401, 3.2, 202, "Bob", "31-03-2002"));
            lms.addStudent(new Student(230104012, 2.5,234, "Alice", "13-02-2005"));
            lms.addStudent(new Student(1904020073, 3.6, 193, "John", "14-02-2001"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add courses
        try {
            lms.addCourse(new Course(11, "Presentation", 4, Department.English, Semester.Fall));
            lms.addCourse(new Course(12, "Speaking", 2, Department.Chinese, Semester.Fall));
            lms.addCourse(new Course(17, "Discrete Math", 5, Department.FIT, Semester.Spring));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Find a student
        String studentID = lms.findStudent("Alice");
        if (studentID != null) {
            System.out.println("Student found with ID: " + studentID);
        } else {
            System.out.println("Student not found.");
        }

        // Find a course
        String courseId = lms.findCourse("Physics");
        if (courseId != null) {
            System.out.println("Course found with ID: " + courseId);
        } else {
            System.out.println("Course not found.");
        }

        // Sort students by name
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        System.out.println("Sorted students by name:");
        lms.getSortedStudents(nameComparator).forEach(student -> System.out.println(student));

        // Sort courses by name
        Comparator<Course> courseNameComparator = Comparator.comparing(Course::getName);
        System.out.println("Sorted courses by name:");
        lms.getSortedCourses(courseNameComparator).forEach(course -> System.out.println(course));
    }
}
