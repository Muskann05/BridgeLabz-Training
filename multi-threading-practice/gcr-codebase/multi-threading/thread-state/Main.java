public class Main {
    public static void main(String[] args) throws InterruptedException {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        Thread[] tasks = {task1, task2};

        StateMonitor monitor = new StateMonitor(tasks);

        // Show NEW state
        System.out.println("[Main] " + task1.getName() + " initial state: " + task1.getState());
        System.out.println("[Main] " + task2.getName() + " initial state: " + task2.getState());

        monitor.start(); // start monitoring

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        monitor.join(); // wait for monitor to finish
    }
}