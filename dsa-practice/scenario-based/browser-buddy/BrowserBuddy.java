import java.util.Scanner;
public class BrowserBuddy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistoryManager history = new HistoryManager();
        ClosedTabStack closedTabs = new ClosedTabStack();
        while (true) {
            System.out.println("BrowserBuddy Menu");
            System.out.println("1. Visit new page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close current tab");
            System.out.println("5. Reopen closed tab");
            System.out.println("6. Show history");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    history.visit(url);
                    break;
                case 2:
                    history.back();
                    break;
                case 3:
                    history.forward();
                    break;
                case 4:
                    Tab current = history.getCurrentTab();
                    if (current != null) {
                        closedTabs.closeTab(current);
                        history.back();
                    } else {
                        System.out.println("No tab to close.");
                    }
                    break;
                case 5:
                    Tab reopened = closedTabs.reopenTab();
                    if (reopened != null) {
                        history.visit(reopened.url);
                    }
                    break;
                case 6:
                    history.displayHistory();
                    break;
                case 7:
                    System.out.println("Exiting BrowserBuddy...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
