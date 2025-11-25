
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Student("Alex", 20, Arrays.asList(90, 85, 88), Arrays.asList("Math", "Biology")
        );

        Person p2 = new Teacher("Mr. Smith", 45, 3500.50, Arrays.asList("Physics", "Chemistry")
        );

        Student s1 = new Student("Bob", 19, Arrays.asList(75, 82, 91), Arrays.asList("History", "English")
        );


        p1.printInfo();
        p2.printInfo();
        s1.printInfo();
    }
}

