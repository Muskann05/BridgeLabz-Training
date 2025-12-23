import java.util.*;

class AddOneToArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int carry = 1;

        for (int i = n - 1; i >= 0 && carry == 1; i--) {
            a[i] = (a[i] + 1) % 10;
            carry = (a[i] == 0) ? 1 : 0;
        }

        if (carry == 1) {
            System.out.print("1 ");
        }

        for (int x : a)
            System.out.print(x + " ");
    }
}
