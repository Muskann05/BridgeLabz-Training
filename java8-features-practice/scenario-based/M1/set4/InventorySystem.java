import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product{

    String name;
    double price;
    int quantity;

    Product(String n,double p,int q){
        name=n; price=p; quantity=q;
    }

    double value(){
        return price*quantity;
    }
}

class Electronics extends Product{

    int warranty;

    Electronics(String n,double p,int q,int w){
        super(n,p,q);
        warranty=w;
    }
}

class Clothing extends Product{

    String size;

    Clothing(String n,double p,int q,String s){
        super(n,p,q);
        size=s;
    }
}

public class InventorySystem{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());

        List<Product> list=new ArrayList<>();

        for(int i=0;i<n;i++){

            String[] p=sc.nextLine().split(", ");

            if(p[0].equals("Electronics")){

                Electronics e=new Electronics(
                    p[1],
                    Double.parseDouble(p[2]),
                    Integer.parseInt(p[3]),
                    Integer.parseInt(p[4])
                );

                list.add(e);

                System.out.println("Product added to inventory: "+p[1]);
            }

            else{

                Clothing c=new Clothing(
                    p[1],
                    Double.parseDouble(p[2]),
                    Integer.parseInt(p[3]),
                    p[4]
                );

                list.add(c);

                System.out.println("Product added to inventory: "+p[1]);
            }
        }

        System.out.println("\nInventory:");

        double total=0;

        for(Product p:list){

            if(p instanceof Electronics){

                Electronics e=(Electronics)p;

                System.out.println(e.name+" - Price: "+e.price+
                ", Quantity: "+e.quantity+
                ", Warranty: "+e.warranty+" months");
            }

            else{

                Clothing c=(Clothing)p;

                System.out.println(c.name+" - Price: "+c.price+
                ", Quantity: "+c.quantity+
                ", Size: "+c.size);
            }

            total+=p.value();
        }

        System.out.printf("\nTotal value of the inventory: %.2f",total);
    }
}