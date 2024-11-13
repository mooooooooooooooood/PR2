package PR2.tut08.course;
import java.util.Comparator;

public class SortCourseByName implements Comparator<Course> {
    @Override
    public int compare (Course c1, Course c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
