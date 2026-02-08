public class PrintJob implements Runnable {
    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    public String getJobName() {
        return jobName;
    }

    public int getPages() {
        return pages;
    }

    public int getPriority() {
        return priority;
    }

    private String getPriorityLabel() {
        if (priority >= 7) return "High Priority";
        else if (priority >= 5) return "Medium Priority";
        else return "Low Priority";
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for(int i=1;i<=pages;i++) {
            System.out.println("[" + getPriorityLabel() + "] Printing " + jobName +
                    " - Page " + i + " of " + pages);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(jobName + " was interrupted.");
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(jobName + " completed in " + (end - start) + "ms");
    }
}