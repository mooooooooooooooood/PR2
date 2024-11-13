package PR2.tut5;

public class PersonTest {
    public static void main(String[] args) {
        Student nam = new Student("Nam", "Hanoi", "IT", 2022, 1000);
        System.out.println(nam.toString());
        Staff vy = new Staff("Vy", "Da Nang", "NEU", 50);
        System.out.println(vy.toString());
    }
}
