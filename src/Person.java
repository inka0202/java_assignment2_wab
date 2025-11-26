import java.io.Serializable;
abstract class Person implements Serializable{
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void printInfo();
}
