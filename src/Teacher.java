import java.util.List;

class Teacher extends Person {
    private double salary;
    private List<String> subjects;

    public Teacher(String name, int age, double salary, List<String> subjects) {
        super(name, age);
        this.salary = salary;
        this.subjects = subjects;
    }

    @Override
    public void printInfo() {
        System.out.println("  Teacher Info ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Subjects taught: " + subjects);
        System.out.println();
    }
}
