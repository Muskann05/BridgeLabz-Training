public class EncryptionService {
    public static void encrypt(Object obj) {
        if (obj instanceof Sensitive) {
            System.out.println("Encrypting sensitive data");
        } else {
            System.out.println("No encryption needed.");
        }
    }
}