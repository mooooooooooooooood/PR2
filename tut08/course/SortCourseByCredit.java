package PR2.tut08.course;
import java.util.Comparator;
public class SortCourseByCredit implements Comparator<Course> {
    @Override
    public int compare (Course c1, Course c2) {
        return c1.getCredits() - c2.getCredits();
    }
}