import java.util.Scanner;

class FriendsComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input ages
        int amarAge = scanner.nextInt();
        int akbarAge = scanner.nextInt();
        int anthonyAge = scanner.nextInt();

        // Input heights
        int amarHeight = scanner.nextInt();
        int akbarHeight = scanner.nextInt();
        int anthonyHeight = scanner.nextInt();

        // Find youngest
        if (amarAge < akbarAge && amarAge < anthonyAge)
            System.out.println("Amar is the youngest");
        else if (akbarAge < amarAge && akbarAge < anthonyAge)
            System.out.println("Akbar is the youngest");
        else
            System.out.println("Anthony is the youngest");

        // Find tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight)
            System.out.println("Amar is the tallest");
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight)
            System.out.println("Akbar is the tallest");
        else
            System.out.println("Anthony is the tallest");
    }
}
