import java.util.Stack;

class StockSpan {

    static void calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }

        System.out.println("Stock Prices:");
        for (int p : price)
            System.out.print(p + " ");

        System.out.println("\nSpan Values:");
        for (int s : span)
            System.out.print(s + " ");
    }

    public static void main(String[] args) {

        int[] price = {100, 80, 60, 70, 60, 75, 85};

        calculateSpan(price);
    }
}
