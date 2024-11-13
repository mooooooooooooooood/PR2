package PR2.tut08.person;
import java.util.Comparator;

public class SortByGPA implements Comparator<Student>{
    @Override
    public int compare (Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}
