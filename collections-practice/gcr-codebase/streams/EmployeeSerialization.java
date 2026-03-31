import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public void display() {
        System.out.println(id + " | " + name + " | " + department + " | " + salary);
    }
}
public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "IT", 60000));
        employees.add(new Employee(102, "Neha", "HR", 50000));
        // Serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> empList = (List<Employee>) ois.readObject();
            System.out.println("Employees retrieved:");
            for (Employee e : empList) {
                e.display();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
