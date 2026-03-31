// process Node class
class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    // define Constructor
    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

// Round Robin class
class RoundRobinScheduler {
    private ProcessNode head = null;
    private int timeQuantum;
    private int currentTime = 0;
    private int processCount = 0;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
        processCount++;
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Remove process by PID
    private void removeProcess(ProcessNode prev, ProcessNode curr) {
        if (curr == head && curr.next == head) {
            head = null;
        } else {
            if (curr == head) {
                head = head.next;
            }
            prev.next = curr.next;
        }
        processCount--;
    }

    // Display processes
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue");
            return;
        }
        ProcessNode temp = head;
        System.out.print("Processes in Queue: ");
        do {
            System.out.print("[P" + temp.pid + " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Round Robin Scheduling Simulation
    public void execute() {
        if (head == null) return;
        ProcessNode curr = head;
        ProcessNode prev = null;
        while (processCount > 0) {
            displayProcesses();
            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += curr.remainingTime;
                curr.remainingTime = 0;
                curr.turnaroundTime = currentTime;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;
                System.out.println("Process P" + curr.pid + " completed.");
                removeProcess(prev, curr);
                curr = (prev != null) ? prev.next : head;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

// Round Robin Class
public class RoundRobinCPU {
    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time Quantum = 4

        // Adding processes (PID, Burst Time, Priority)
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 2);

        scheduler.execute();

        // Average Waiting & Turnaround Time Calculation
        int totalWT = 0, totalTAT = 0;
        int n = 4;

        totalWT = (10 - 10) + (17 - 5) + (23 - 8) + (29 - 6);
        totalTAT = 10 + 17 + 23 + 29;

        System.out.println("\nAverage Waiting Time = " + (float) totalWT / n);
        System.out.println("Average Turnaround Time = " + (float) totalTAT / n);
    }
}
