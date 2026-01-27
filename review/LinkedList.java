public class LinkedList{
    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Delete a value
    public void delete(int key) {
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        // Search the key
        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // If not found
        if(temp == null) return;
        prev.next = temp.next;
    }
   // search value
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("Linked List: ");
        list.display();
        list.delete(20);
        System.out.print("After deleting 20: ");
        list.display();
    }
}