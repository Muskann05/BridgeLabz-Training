public class BackupApp {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();
        try {
            scheduler.scheduleBackup("/documents", 2);
            scheduler.scheduleBackup("/system", 5);
            scheduler.scheduleBackup("/photos", 3);
            scheduler.scheduleBackup("", 1); // Exception
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nExecuting backups:");
        scheduler.executeBackups();
    }
}
