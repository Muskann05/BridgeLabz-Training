public class HistoryManager {
    private Tab head;
    private Tab current;
    // Open a new page
    public void visit(String url) {
        Tab newTab = new Tab(url);
        if (head == null) {
            head = newTab;
            current = newTab;
        } else {
            current.next = newTab;
            newTab.prev = current;
            current = newTab;
        }
        System.out.println("Visited: " + url);
    }

    // Go back
    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved back to: " + current.url);
        } else {
            System.out.println("No previous page.");
        }
    }

    // Go forward
    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved forward to: " + current.url);
        } else {
            System.out.println("No next page.");
        }
    }

    // Get current tab
    public Tab getCurrentTab() {
        return current;
    }

    // Display full history
    public void displayHistory() {
        if (head == null) {
            System.out.println("No browsing history.");
            return;
        }

        Tab temp = head;
        System.out.print("History: ");
        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.url + "] ");
            } else {
                System.out.print(temp.url + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
