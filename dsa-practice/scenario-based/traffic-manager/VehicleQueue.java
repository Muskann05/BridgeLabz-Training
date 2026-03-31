public class VehicleQueue {
    private String[] queue;
    private int front, rear, size, capacity;
    public VehicleQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    // Enqueue
    public void enqueue(String vehicle) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Vehicle cannot enter now.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = vehicle;
        size++;
        System.out.println("Vehicle " + vehicle + " added to waiting queue.");
    }
    // Dequeue
    public String dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicle waiting.");
            return null;
        }
        String vehicle = queue[front];
        front = (front + 1) % capacity;
        size--;
        return vehicle;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
