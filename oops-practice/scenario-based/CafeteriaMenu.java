import java.util.Scanner;

class CafeteriaMenu {

    static String[] menu = {
        "Idli", "Dosa", "Vada", "Upma", "Pasta",
        "Burger", "Sandwich", "Fried Rice", "Noodles", "Coffee"
    };

    // Display menu
    static void displayMenu() {
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i]);
        }
    }

    // Get item by index
    static void getItemByIndex(int index) {
        if (index >= 0 && index < menu.length) {
            System.out.println("You selected: " + menu[index]);
        } else {
            System.out.println("Invalid menu selection");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayMenu();
        System.out.print("Enter item index: ");
        int choice = sc.nextInt();

        getItemByIndex(choice);
    }
}
