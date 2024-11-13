package PR2.tut1;

public class PrintInitials {
    public static void main(String[] args) {
        String[] characterD = {
                "******     ",
                "**    **   ",
                "**     **  ",
                "**       **",
                "**       **",
                "**       **",
                "**     **  ",
                "**    **   ",
                "*****      "
        };

        String[] characterJ = {
                " *************",
                "       **     ",
                "       **     ",
                "       **     ",
                "       **     ",
                "**     **     ",
                " **    **     ",
                "   **  **     ",
                "     ****     "
        };

        String[] characterE = {
                "**********",
                "**",
                "**",
                "**",
                "********",
                "**",
                "**",
                "**",
                "**********"
        };

        for (int i = 0; i < characterD.length; i++ ) {
            System.out.println(characterD[i] + "   " + characterJ[i] + "   " + characterE[i]);
        }
    }
}
