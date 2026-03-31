import java.util.*;

class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - a[i])) {
                System.out.println(map.get(target - a[i]) + " " + i);
                return;
            }
            map.put(a[i], i);
        }
    }
}
