// Superclass
class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Teacher subclass
class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role    : Teacher");
        System.out.println("Subject : " + subject);
    }
}

// Student subclass
class Student extends Person {

    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role  : Student");
        System.out.println("Grade : " + grade);
    }
}

// Staff subclass
class Staff extends Person {

    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role       : Staff");
        System.out.println("Department : " + department);
    }
}

// Main class
public class SchoolSystem {

    public static void main(String[] args) {

        Teacher t = new Teacher("Anita", 35, "Mathematics");
        Student s = new Student("Rahul", 16, "10th Grade");
        Staff st = new Staff("Ramesh", 40, "Administration");

        System.out.println(" Teacher Details ");
        t.displayPersonInfo();
        t.displayRole();

        System.out.println(" Student Details  ");
        s.displayPersonInfo();
        s.displayRole();

        System.out.println(" Staff Details");
        st.displayPersonInfo();
        st.displayRole();
    }
}
