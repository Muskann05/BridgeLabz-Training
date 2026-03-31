import java.util.*;
public class SearchComparison2 {

    public static void main(String[] args) {
        int n = 1000000; 
        int target = n - 1;
        // Create data structures
        int[] array = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
        //  Array Search 
        long startArray = System.nanoTime();
        boolean foundArray = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                foundArray = true;
                break;
            }
        }
        long endArray = System.nanoTime();
        //  HashSet Search 
        long startHash = System.nanoTime();
        boolean foundHash = hashSet.contains(target);
        long endHash = System.nanoTime();
        //  TreeSet Search 
        long startTree = System.nanoTime();
        boolean foundTree = treeSet.contains(target);
        long endTree = System.nanoTime();
        // Convert to milliseconds
        long arrayTime = (endArray - startArray) / 1_000_000;
        long hashTime = (endHash - startHash) / 1_000_000;
        long treeTime = (endTree - startTree) / 1_000_000;
        // Output
        System.out.println("Dataset Size: " + n);
        System.out.println("\nSearch Results:");
        System.out.println("Array Search Found: " + foundArray);
        System.out.println("HashSet Search Found: " + foundHash);
        System.out.println("TreeSet Search Found: " + foundTree);

        System.out.println("\nTime Taken:");
        System.out.println("Array Search Time: " + arrayTime + " ms");
        System.out.println("HashSet Search Time: " + hashTime + " ms");
        System.out.println("TreeSet Search Time: " + treeTime + " ms");
    }
}
