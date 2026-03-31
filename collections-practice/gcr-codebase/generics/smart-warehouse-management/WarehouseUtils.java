import java.util.List;

public class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        System.out.println("Warehouse Items");
        for (WarehouseItem item : items) {
            System.out.println(
                "Category: " + item.getCategory() +
                ", Name: " + item.getName() +
                ", Price: Rs." + item.getPrice()
            );
        }
    }
}
