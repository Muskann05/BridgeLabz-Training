// Node class for Circular Linked List
class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

// Circular Linked List class
class TaskCircularLinkedList {
    private TaskNode head;
    private TaskNode current;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;
        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Task ID
    public void removeByTaskId(int id) {
        if (head == null)
            return;
        TaskNode temp = head;
        TaskNode prev = null;
        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed: " + id);
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found: " + id);
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        System.out.println("\nAll Tasks:");
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null)
            return;

        TaskNode temp = head;
        boolean found = false;

        System.out.println("\nTasks with Priority " + priority + ":");
        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found");
    }

    // Helper method
    private void displayTask(TaskNode t) {
        System.out.println(
            "Task ID: " + t.taskId +
            ", Name: " + t.taskName +
            ", Priority: " + t.priority +
            ", Due Date: " + t.dueDate
        );
    }
}

// Main class
public class TaskScheduler {
    public static void main(String[] args) {
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtBeginning(1, "Design Module", 1, "10-02-2026");
        scheduler.addAtEnd(2, "Implement Code", 2, "15-02-2026");
        scheduler.addAtEnd(3, "Testing", 1, "20-02-2026");
        scheduler.addAtPosition(2, 4, "Documentation", 3, "18-02-2026");

        scheduler.displayAllTasks();

        System.out.println("\nViewing tasks circularly:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        scheduler.searchByPriority(1);

        scheduler.removeByTaskId(4);

        scheduler.displayAllTasks();
    }
}
