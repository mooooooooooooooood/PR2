package PR2.tut08.person;
import java.util.*;

public class PersonTest {
    public static void main(String[] args) throws Exception {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(202, "Bob", "31-03-2002", "bob313@gmail.com", "+84365378231", "Nguyen Trai"));
        personList.add(new Person(234, "Alice", "13-02-2005", "alice132@gmail.com", "+84365332431", "Vu Trong Phung"));
        personList.add(new Person(193, "John", "14-02-2001", "john@gmail.com", "+84365567231", "Nguyen Xien"));

        System.out.println("Sorting person by name: ");
        Collections.sort(personList, new SortByName());
        for (Person person : personList) {
            System.out.println(person.toString());
        }

        System.out.println("Sorting person by age: ");
        Collections.sort(personList, new SortByAge());
        for (Person person : personList) {
            System.out.println(person.toString());
        }

        System.out.println("Sorting person by name and age: ");
        Collections.sort(personList, new SortByNameAndAge());
        for (Person person : personList) {
            System.out.println(person.toString());
        }
    }
}
