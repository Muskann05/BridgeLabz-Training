import java.util.ArrayList;
import java.util.List;
// use generics 
public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getName() + " added to storage.");
    }
    public T getItem(int index) {
        return items.get(index);
    }
    public List<T> getAllItems() {
        return items;
    }
}
