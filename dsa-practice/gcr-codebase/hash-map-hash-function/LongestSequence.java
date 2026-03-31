import java.util.*;

class LongestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++)
            set.add(sc.nextInt());

        int max = 0;

        for (int x : set) {
            if (!set.contains(x - 1)) {
                int count = 1;
                while (set.contains(x + count))
                    count++;
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
