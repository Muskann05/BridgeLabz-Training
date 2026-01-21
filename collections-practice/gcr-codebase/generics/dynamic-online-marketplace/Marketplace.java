import java.util.ArrayList;
import java.util.List;

public class Marketplace {
    public static void main(String[] args) {

        Product<BookCategory> book = new Product<>("Java Programming", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1200, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 25000, new GadgetCategory());

        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        MarketplaceUtils.applyDiscount(book, 10);
        MarketplaceUtils.applyDiscount(shirt, 20);
        MarketplaceUtils.applyDiscount(phone, 5);

        System.out.println("Product Catalog");
        for (Product<?> product : catalog) {
            System.out.println(
                "Name: " + product.getName() +
                ", Category: " + product.getCategory().getCategoryName() +
                ", Price: Rs." + product.getPrice()
            );
        }
    }
}
