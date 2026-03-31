public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        // RUNNABLE state (computation)
        for (int i = 0; i < 1_000_000; i++) {
            Math.sqrt(i);
        }

        // TIMED_WAITING state
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}