import java.io.*;
import java.util.List;

public class PersonLoader {

    public static List<Person> loadPersonsFromFile(String fileName) {
        List <Person> persons =null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            persons = (List<Person>)objectIn.readObject();

            objectIn.close();
            fileIn.close();

            System.out.println("File '"+ fileName + "' has been loaded successfully");
        } catch (FileNotFoundException e) {
            System.out.println("Error File Not Found: " + e.getMessage());
        }catch (IOException e){
            System.out.println("Error while loading persons: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Class Not Found while loading persons");
        }
        return persons;
    }

    public static void main(String[] args) {
        String fileName = "persons.dat";
        List<Person> loadedPersons = loadPersonsFromFile(fileName);

        if (loadedPersons != null) {
            System.out.println("\n\tPersons Loaded From File\n");
            for (Person p : loadedPersons) {
                p.printInfo();
            }
        }
    }
}
