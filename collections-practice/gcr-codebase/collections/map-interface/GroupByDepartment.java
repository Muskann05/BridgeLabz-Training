import java.util.*;
public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : employees) {
            departmentMap
                .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                .add(emp);
        }
        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
