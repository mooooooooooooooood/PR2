package PR2.tut08.course;

import java.util.*;

public class CourseTest {
    public static void main(String[] args) throws Exception {
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(11, "Presentation", 4, Department.English, Semester.Fall));
        courseList.add(new Course(12, "Speaking", 2, Department.Chinese, Semester.Fall));
        courseList.add(new Course(17, "Discrete Math", 5, Department.FIT, Semester.Spring));

        System.out.println("Sorting course by name: ");
        Collections.sort(courseList, new SortCourseByName());
        for (Course course : courseList) {
            System.out.println(course.toString());
        }

        System.out.println("Sorting course by credits: ");
        Collections.sort(courseList, new SortCourseByCredit());
        for (Course course : courseList) {
            System.out.println(course.toString());
        }

        System.out.println("Sorting course by department: ");
        Collections.sort(courseList, new SortCourseByDepartment());
        for (Course course : courseList) {
            System.out.println(course.toString());
        }

        System.out.println("Sorting course by semester: ");
        Collections.sort(courseList, new SortCourseBySemester());
        for (Course course : courseList) {
            System.out.println(course.toString());
        }
    }
}
