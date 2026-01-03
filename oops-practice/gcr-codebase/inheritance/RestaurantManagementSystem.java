// Interface
interface Worker {
    void performDuties();
}

// Superclass
class Person {

    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Chef subclass
class Chef extends Person implements Worker {

    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties : Cooking " + specialty + " dishes");
    }
}

// Waiter subclass
class Waiter extends Person implements Worker {

    int tableCount;

    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties : Serving " + tableCount + " tables");
    }
}

// Main class
public class RestaurantManagementSystem {

    public static void main(String[] args) {

        Worker chef = new Chef("Arjun", 101, "Italian");
        Worker waiter = new Waiter("Ravi", 102, 8);

        System.out.println(" Chef ");
        ((Person) chef).displayInfo();
        chef.performDuties();

        System.out.println("\n Waiter ");
        ((Person) waiter).displayInfo();
        waiter.performDuties();
    }
}
