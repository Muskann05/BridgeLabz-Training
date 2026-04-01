class MathUtility {

    // Factorial method
    static int factorial(int n) {
        if (n < 0) return -1;
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Prime check method
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    // GCD method
    static int gcd(int a, int b) {
        if (a < 0 || b < 0) return -1;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Fibonacci method
    static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println("Factorial(5): " + factorial(5));
        System.out.println("Is 7 Prime? " + isPrime(7));
        System.out.println("GCD(12,18): " + gcd(12, 18));
        System.out.println("Fibonacci(6): " + fibonacci(6));

        // Edge cases
        System.out.println("Factorial(-2): " + factorial(-2));
        System.out.println("Is 1 Prime? " + isPrime(1));
        System.out.println("Fibonacci(0): " + fibonacci(0));
    }
}
