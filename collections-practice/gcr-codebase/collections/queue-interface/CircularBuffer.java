public class CircularBuffer {
    private int[] buffer;
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private int capacity;
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }
    public void add(int value) {
        if (size == capacity) {
            // Overwrite oldest
            front = (front + 1) % capacity;
            size--;
        }
        buffer[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
    }
    public void display() {
        System.out.print("Buffer: [");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(buffer[index]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display(); 
        cb.add(4);
        cb.display(); 
    }
}
