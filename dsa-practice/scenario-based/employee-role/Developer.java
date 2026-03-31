public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }
    protected double computeBonus() {
        return getSalary() > 50000 ? getSalary() * 0.05 : 0.0;
    }
}
