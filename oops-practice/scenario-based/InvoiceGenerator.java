class InvoiceGenerator {

    // Method to parse invoice and print tasks
    static String[] parseInvoice(String input) {
        String[] tasks = input.split(",");
        return tasks;
    }

    // Method to calculate total amount
    static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (int i = 0; i < tasks.length; i++) {
            String task = tasks[i].trim();
            String[] parts = task.split("-");

            String amountPart = parts[1].trim(); // "3000 INR"
            int amount = Integer.parseInt(amountPart.split(" ")[0]);

            total += amount;
        }
        return total;
    }

    public static void main(String[] args) {

        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        String[] tasks = parseInvoice(input);

        System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        int total = getTotalAmount(tasks);
        System.out.println("Total Invoice Amount: " + total + " INR");
    }
}
