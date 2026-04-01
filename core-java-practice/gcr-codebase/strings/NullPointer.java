class NullPointer {

    // Method that generates exception
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Exception
    }

    // Method that handles exception
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
