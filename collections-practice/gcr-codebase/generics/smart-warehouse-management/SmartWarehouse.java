public class SmartWarehouse {
    public static void main(String[] args) {
        // object 
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop", 75000));
        electronicsStorage.addItem(new Electronics("Smartphone", 30000));

        groceriesStorage.addItem(new Groceries("Rice", 1200));
        groceriesStorage.addItem(new Groceries("Milk", 60));
        
        furnitureStorage.addItem(new Furniture("Sofa", 25000));
        furnitureStorage.addItem(new Furniture("Table", 8000));

        WarehouseUtils.displayItems(electronicsStorage.getAllItems());
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}
