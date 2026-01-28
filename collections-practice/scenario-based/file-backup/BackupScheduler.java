import java.util.PriorityQueue;
public class BackupScheduler {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();
    public void scheduleBackup(String folderPath, int priority)
            throws InvalidBackupPathException {
        if (folderPath == null || folderPath.trim().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path.");
        }
        queue.add(new BackupTask(folderPath, priority));
        System.out.println("Backup scheduled for: " + folderPath);
    }
    public void executeBackups() {
        while (!queue.isEmpty()) {
            BackupTask task = queue.poll();
            task.execute();
        }
    }
}
