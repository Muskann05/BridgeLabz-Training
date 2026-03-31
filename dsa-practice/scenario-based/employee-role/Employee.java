public abstract class Employee {
    private final String name;
    private final double salary;
    private final double bonus; 
    // constructor
    protected Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = computeBonus();
    }
    protected abstract double computeBonus();
    public final double getBonus() {
        return bonus;
    }
    public final String getName() {
        return name;
    }
    public final double getSalary() {
        return salary;
    }
}
