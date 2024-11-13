package PR2.tut08.course;
import java.util.Comparator;
public class SortCourseByDepartment implements Comparator<Course> {
    @Override
    public int compare (Course c1, Course c2) {
        return c1.getDepartment().compareTo(c2.getDepartment());
    }
}
