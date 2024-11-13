package PR2.tut11;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(3);
        list.add(5.0f);
        list.add(false);
        list.add("String");

        System.out.println("Values from list: ");
        for (Object value: list) {
            System.out.println(value);
        }
    }
}
