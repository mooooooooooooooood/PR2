package PR2.tut11;

import java.util.ArrayList;

public class ArrayListIntegerLoop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i<= 10; i++) {
            list.add(i);
        }
        System.out.println("Numbers in list: ");
        for (Object number: list) {
            System.out.println(number);
        }
    }
}
