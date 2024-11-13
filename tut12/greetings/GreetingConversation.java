package PR2.tut12.greetings;

public class GreetingConversation {
    private static GreetingConversation instance;

    // Private constructor to prevent instantiation from outside
    private GreetingConversation() {
    }

    // Static method to get the singleton instance
    public static GreetingConversation getInstance() {
        if (instance == null) {
            instance = new GreetingConversation();
        }
        return instance;
    }

    public void startConversation() {
        try {
            MobilePhone m1 = new MobilePhone("Apple", "M-ABC-123", Color.Yellow, 2008, false);
            MobilePhone m2 = new MobilePhone("Apple", "M-DUX-872", 'R', 2021, true);

            System.out.println("MobilePhone 1 Color Code: " + m1.getColorCode());
            System.out.println("MobilePhone 2 Color Code: " + m2.getColorCode());

            Person p1 = new Person(1, "Quan Dang");
            Person p2 = new Person(2, "Thuan Nguyen");
            p1.setPhone(m1);
            p2.setPhone(m2);
            p1.greet();
            p2.greet();
            System.out.println(p1);
            System.out.println(p2);
        } catch (NotPossibleException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GreetingConversation conversation = GreetingConversation.getInstance();
        conversation.startConversation();
    }
}
