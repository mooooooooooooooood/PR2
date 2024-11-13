package PR2.tut08.lms;
import PR2.tut08.course.Course;
import PR2.tut08.person.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Comparator;

public class LearningManagementSystem {
    private Map<String, Student> students; // Changed to use String for Student ID
    private Map<String, Course> courses; // Changed to use String for Course ID
    private String currentSeason;
    private int currentYear;
    private int studentIdCounter = 0; // Counter to generate unique student IDs
    private int courseIdCounter = 0; // Counter to generate unique course IDs

    //Constructor
    public LearningManagementSystem(Map<String, Student> students, Map<String, Course> courses) {
        this.students = new HashMap<>();
        this.courses = new HashMap<>();
    }

    public LearningManagementSystem(Map<String, Student> students, Map<String, Course> courses, String currentSeason, int currentYear) {
        this.students = new HashMap<>();
        this.courses = new HashMap<>();
        this.currentSeason = currentSeason;
        this.currentYear = currentYear;
    }

    // Method to add a student dynamically
    public void addStudent(Student student) throws Exception {
        String studentId = generateStudentId(); // Generate unique student ID
        student.setStudentID(Integer.parseInt(studentId)); // Set the ID for the student
        students.put(studentId, student); // Add student to the map with ID as key
    }

    // Method to add a course dynamically
    public void addCourse(Course course) throws Exception {
        String courseId = generateCourseId(); // Generate unique course ID
        course.setCourseID(Integer.parseInt(courseId)); // Set the ID for the course
        courses.put(courseId, course); // Add course to the map with ID as key
    }

    // Method to generate unique student ID based on the current season and year
    private String generateStudentId() {
        studentIdCounter++; // Increment counter for each new student
        return currentSeason.substring(0, 2).toUpperCase() + currentYear + studentIdCounter; // Generate ID in format "SP2024X" where X is the auto-incremented number
    }

    // Method to generate unique course ID based on the current season and year
    private String generateCourseId() {
        courseIdCounter++; // Increment counter for each new course
        return currentSeason.substring(0, 2).toUpperCase() + currentYear + courseIdCounter; // Generate ID in format "SP2024X" where X is the auto-incremented number
    }

    // Method to remove a student based on ID
    public void removeStudent(int studentID) {
        students.remove(studentID);
    }

    // Method to remove a course based on ID
    public void removeCourse(int courseID) {
        courses.remove(courseID);
    }

    // Method to search for a student based on specified criteria
    public String findStudent(String criteria) {
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(criteria)) {
                return entry.getKey();
            }
        }
        return null; // Return null if no student found with the specified criteria
    }

    // Method to search for a course based on specified criteria
    public String findCourse(String criteria) {
        for (Map.Entry<String, Course> entry : courses.entrySet()) {
            if (entry.getValue().getName().equalsIgnoreCase(criteria)) {
                return entry.getKey();
            }
        }
        return null; // Return null if no course found with the specified criteria
    }

    // Method to return ascending sorted list of students based on a comparator
    public List<Student> getSortedStudents(Comparator<Student> comparator) {
        return students.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    // Method to return ascending sorted list of courses based on a comparator
    public List<Course> getSortedCourses(Comparator<Course> comparator) {
        return courses.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
    @Override
    public String toString() {
        return "LearningManagementSystem[" +
                "students=" + students +
                ",courses=" + courses +
                ",currentSeason=" + currentSeason +
                ",currentYear=" + currentYear +
                ']';
    }
}
