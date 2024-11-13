package PR2.tut08.person;
import java.util.Comparator;

public class SortByNameAndAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int nameComparison = p1.getName().compareTo(p2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            try {
                return compareByAge(p1, p2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public int compareByAge(Person p1, Person p2) throws Exception{
        int[] dateOfPerson1 = stringArrayToIntArray(parseDateToArray(p1.getDateOfBirth()));
        int[] dateOfPerson2 = stringArrayToIntArray(parseDateToArray(p2.getDateOfBirth()));
        int yearCompare = dateOfPerson1[2] - dateOfPerson2[2];
        int monthCompare = dateOfPerson1[1] - dateOfPerson2[1];
        int dayCompare = dateOfPerson1[0] - dateOfPerson2[0];

        if (yearCompare == 0) {
            if (monthCompare == 0) return dayCompare;
            else if (dayCompare == 0) return monthCompare;
        }
        return yearCompare;
    }

    public String[] parseDateToArray(String dateOfBirth) throws Exception{
        if (dateOfBirth.contains(".")) return dateOfBirth.split(".");
            else if (dateOfBirth.contains("/")) return dateOfBirth.split("/");
                else if (dateOfBirth.contains("-")) return dateOfBirth.split("-");
                    else throw new Exception("Wrong date format!");
    }

    public int[] stringArrayToIntArray(String[] stringArr) {
        int[] intArr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
        }
        return intArr;
    }
}
