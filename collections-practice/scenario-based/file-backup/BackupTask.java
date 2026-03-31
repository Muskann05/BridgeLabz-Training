public class BackupTask implements Comparable<BackupTask> {
    String folderPath;
    int priority;
    public BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }
    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority);
    }
    public void execute() {
        System.out.println("Backing up: " + folderPath + " (Priority: " + priority + ")");
    }
}
