public class Main {
    public static void main(String[] args) {
        String password = "Hello123";
        if (Security.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
