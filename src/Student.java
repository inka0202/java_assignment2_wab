import java.util.List;

class Student extends Person {
    private List<Integer> grades;
    private List<String> subjects;
//task: student name should have more 5 characters
    public Student(String name, int age, List<Integer> grades, List<String> subjects) throws Exception {
        super(name, age);
        if (name.length() <= 5) {
            throw new Exception("Student name must have more than 5 characters.");
//            System.out.println("name "+ this.name+" --- Exception: Student name must have more than 5 characters.");;
        }
        this.grades = grades;
        this.subjects = subjects;
    }

    @Override
    public void printInfo() {
        System.out.println(" Student Info");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grades: " + grades);
        System.out.println("Subjects: " + subjects);
        System.out.println();
    }
}
