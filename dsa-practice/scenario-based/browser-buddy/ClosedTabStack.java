import java.util.Stack;
public class ClosedTabStack {
    private Stack<Tab> stack = new Stack<>();
    public void closeTab(Tab tab) {
        if (tab != null) {
            stack.push(tab);
            System.out.println("Closed tab: " + tab.url);
        }
    }
    public Tab reopenTab() {
        if (stack.isEmpty()) {
            System.out.println("No closed tabs to reopen.");
            return null;
        }
        Tab reopened = stack.pop();
        System.out.println("Reopened tab: " + reopened.url);
        return reopened;
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
