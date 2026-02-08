public class Guest implements User {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Guest.");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}