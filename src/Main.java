import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Main {
    public static void savePersonsToFile(List<Person> persons, String fileName) {

        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(persons);

            objectOut.close();
            fileOut.close();
            System.out.println("File '"+ fileName + "' has been saved");
        } catch (IOException e) {
            System.out.println("  Error while saving persons: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    try {
        persons.add(new Student("Alicee", 20, Arrays.asList(90, 85, 88), Arrays.asList("Math", "Biology")));

        persons.add(new Teacher("Mr. Smith", 45, 3500.50, Arrays.asList("Physics", "Chemistry")));

        persons.add(new Student("Inessa", 19, Arrays.asList(75, 82, 91), Arrays.asList("History", "English")));
        persons.add(new Student("Violetta", 20, Arrays.asList(95, 32, 25), Arrays.asList("History", "English")));
        persons.add(new Teacher("Mr. Alex", 25, 3200.50, Arrays.asList("Spanish", "Academic life")));
    }
    catch (Exception e) {  System.out.println("Failed to create a person: " + e.getMessage());}

    String fileName="persons.dat";
    savePersonsToFile(persons, fileName);


    }
}

