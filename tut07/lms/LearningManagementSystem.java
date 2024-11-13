package PR2.tut07.lms;

public class LearningManagementSystem {
    public static void main(String[] args) throws Exception{
        Student student1 = new Student(1, "Linh", "03-06-2004");
        Student student2 = new Student(2, "Lan", "22-08-2002");
        Student student3 = new Student(3,"Vinh", "04-12-2001");

        Course course1 = new Course(101, "Physics", 3);
        Course course2 = new Course(202, "Math",2);
        Course course3 = new Course(204, "Literature", 4);


        
        System.out.println("Student 1 information: " + student1);
        student1.getEnrolledCourses().add(course1);
        System.out.println("Student 1 courses:" + student1.getEnrolledCourses());
        System.out.println();
        System.out.println("Student 2 information: " + student2);
        System.out.println();
        System.out.println("Student 3 information: " + student3);

        System.out.println("Course 1 information: " + course1);
        System.out.println();
        System.out.println("Course 2 information: " + course2);
        System.out.println();
        System.out.println("Course 3 information: " + course3);
    }
}
