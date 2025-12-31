// Item class
class Item {

    // attributes
    String itemCode;
    String itemName;
    double price;

    // method to display item details
    void displayItem() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }

    // method to calculate total cost
    void calculateTotalCost(int quantity) {
        double totalCost = price * quantity;
        System.out.println("Total cost for quantity " + quantity + " : " + totalCost);
        System.out.println();
    }

    // main method
    public static void main(String[] args) {

        // first item
        Item item1 = new Item();
        item1.itemCode = "01AA";
        item1.itemName = "Water bottle";
        item1.price = 500.0;

        // second item
        Item item2 = new Item();
        item2.itemCode = "01BB";
        item2.itemName = "Rice";
        item2.price = 700.0;

        // third item
        Item item3 = new Item();
        item3.itemCode = "02AA";
        item3.itemName = "blackboard";
        item3.price = 400.0;

        // displaying item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // calculating total cost (example quantities)
        item1.calculateTotalCost(2);
        item2.calculateTotalCost(3);
        item3.calculateTotalCost(5);
    }
}
