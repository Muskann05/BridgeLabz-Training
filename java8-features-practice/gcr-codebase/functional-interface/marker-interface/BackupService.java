public class BackupService {
    public static void backup(Object obj) {
        if (obj instanceof Backupable) {
            System.out.println("Object is backed up successfully.");
        } else {
            System.out.println("Object is NOT eligible for backup.");
        }
    }
}