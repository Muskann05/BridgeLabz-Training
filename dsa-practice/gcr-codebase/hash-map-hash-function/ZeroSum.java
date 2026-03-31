import java.util.*;

class ZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        set.add(0);

        for (int x : a) {
            sum += x;
            if (set.contains(sum)) {
                System.out.println("Yes");
                return;
            }
            set.add(sum);
        }
        System.out.println("No");
    }
}
