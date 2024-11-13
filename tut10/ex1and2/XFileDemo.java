package PR2.tut10.ex1and2;

import java.util.ArrayList;
import java.util.List;

public class XFileDemo {
    public static void main(String[] args) {
        byte[] data = XFile.read("src/PR2/tut10/ex1and2/a.text");
        XFile.write("src/PR2/tut10/ex1and2/b.text", data);

        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", 5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));
        XFile.writeObject("src/PR2/tut10/student.dat", list);
        System.out.println("Student list: ");
        List<Student> readList = (List<Student>) XFile.readObject("src/PR2/tut10/ex1and2/student.dat");
        for (Student student : readList) {
            System.out.println(student);
        }
    }
}
