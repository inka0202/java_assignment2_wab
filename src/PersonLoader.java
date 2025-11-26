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
            System.out.println("File not found: " + fileName);

        }catch (IOException e){
            System.out.println("I/O error while reading the file: " + e.getMessage());

        }catch (ClassNotFoundException e){
            System.out.println("Class Not Found while loading persons" + e.getMessage());

        }catch (ClassCastException e) {
            System.out.println("Data in the file cannot be cast to List<Person>");
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
