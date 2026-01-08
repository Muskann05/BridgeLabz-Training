class Item {
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;

    Item(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    // Add at beginning
    void addAtBeginning(Item item) {
        item.next = head;
        head = item;
    }

    // Add at end
    void addAtEnd(Item item) {
        if (head == null) {
            head = item;
            return;
        }
        Item temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = item;
    }

    // Add at specific position (1-based)
    void addAtPosition(Item item, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(item);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        item.next = temp.next;
        temp.next = item;
    }

    // Remove by Item ID
    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID
    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Name
    void searchByName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Item not found");
    }

    // Total inventory value
    double totalValue() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.price * temp.quantity;
            temp = temp.next;
        }
        return sum;
    }

    // Display inventory
    void display() {
        Item temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(Item i) {
        System.out.println(
            "ID: " + i.itemId +
            ", Name: " + i.itemName +
            ", Qty: " + i.quantity +
            ", Price: " + i.price
        );
    }

    // Sorting APIs
    void sortByName(boolean asc) {
        head = mergeSort(head, asc, true);
    }

    void sortByPrice(boolean asc) {
        head = mergeSort(head, asc, false);
    }

    // Merge Sort for Linked List
    private Item mergeSort(Item node, boolean asc, boolean byName) {
        if (node == null || node.next == null)
            return node;
        Item mid = getMiddle(node);
        Item next = mid.next;
        mid.next = null;
        Item left = mergeSort(node, asc, byName);
        Item right = mergeSort(next, asc, byName);
        return merge(left, right, asc, byName);
    }

    private Item merge(Item a, Item b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;
        int cmp = byName
                ? a.itemName.compareToIgnoreCase(b.itemName)
                : Double.compare(a.price, b.price);
        if ((asc && cmp <= 0) || (!asc && cmp > 0)) {
            a.next = merge(a.next, b, asc, byName);
            return a;
        } else {
            b.next = merge(a, b.next, asc, byName);
            return b;
        }
    }
    private Item getMiddle(Item h) {
        Item slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {

        Inventory inv = new Inventory();

        inv.addAtEnd(new Item(101, "Keyboard", 10, 500));
        inv.addAtEnd(new Item(102, "Mouse", 20, 300));
        inv.addAtBeginning(new Item(103, "Monitor", 5, 8000));
        inv.addAtPosition(new Item(104, "CPU", 3, 25000), 2);

        System.out.println("Inventory:");
        inv.display();

        inv.updateQuantity(102, 25);

        System.out.println("\nSearch by ID:");
        inv.searchById(103);

        System.out.println("\nSearch by Name:");
        inv.searchByName("Mouse");

        System.out.println("\nTotal Inventory Value: " + inv.totalValue());

        System.out.println("\nSorted by Price (Ascending):");
        inv.sortByPrice(true);
        inv.display();

        System.out.println("\nSorted by Name (Descending):");
        inv.sortByName(false);
        inv.display();

        inv.removeById(101);

        System.out.println("\nAfter Removing Item ID 101:");
        inv.display();
    }
}
