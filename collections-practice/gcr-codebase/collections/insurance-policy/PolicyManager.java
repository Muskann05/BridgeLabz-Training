import java.time.LocalDate;
import java.util.*;
public class PolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("All Unique Policies:");
        for (InsurancePolicy policy : hashSet) {
            System.out.println(policy);
        }
    }

    // Policies expiring within next 30 days
    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring Within 30 Days:");
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (InsurancePolicy policy : treeSet) {
            if (!policy.getExpiryDate().isBefore(today) &&
                !policy.getExpiryDate().isAfter(next30Days)) {
                System.out.println(policy);
            }
        }
    }

    // Policies by coverage type
    public void displayByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type: " + coverageType);
        for (InsurancePolicy policy : hashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    // Find duplicate policies by policy number
    public void findDuplicatePolicies(List<InsurancePolicy> allPolicies) {
        System.out.println("\nDuplicate Policies Based on Policy Number:");
        Set<Integer> seen = new HashSet<>();
        for (InsurancePolicy policy : allPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                System.out.println(policy);
            }
        }
    }

    // Performance comparison
    public void performanceTest() {
        int size = 100000;
        List<InsurancePolicy> policies = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            policies.add(new InsurancePolicy(i, "User" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Health", 1000 + i));
        }

        // HashSet Performance
        long start = System.nanoTime();
        Set<InsurancePolicy> hs = new HashSet<>();
        for (InsurancePolicy p : policies) hs.add(p);
        long end = System.nanoTime();
        System.out.println("\nHashSet Add Time: " + (end - start) + " ns");

        // LinkedHashSet Performance
        start = System.nanoTime();
        Set<InsurancePolicy> lhs = new LinkedHashSet<>();
        for (InsurancePolicy p : policies) lhs.add(p);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        // TreeSet Performance
        start = System.nanoTime();
        Set<InsurancePolicy> ts = new TreeSet<>();
        for (InsurancePolicy p : policies) ts.add(p);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");
    }

    // Main method for testing
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();

        InsurancePolicy p1 = new InsurancePolicy(101, "Muskan Gupta",
                LocalDate.now().plusDays(10), "Health", 5000);
        InsurancePolicy p2 = new InsurancePolicy(102, "Rahul Sharma",
                LocalDate.now().plusDays(40), "Auto", 3000);
        InsurancePolicy p3 = new InsurancePolicy(103, "Anita Verma",
                LocalDate.now().plusDays(20), "Home", 7000);
        InsurancePolicy p4 = new InsurancePolicy(101, "Duplicate User",
                LocalDate.now().plusDays(15), "Health", 6000); // Duplicate

        // Add policies
        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);
        manager.addPolicy(p4); 

        // Display all
        manager.displayAllPolicies();

        // Expiring soon
        manager.displayExpiringSoon();

        // Coverage type filter
        manager.displayByCoverageType("Health");

        // Duplicate detection (from original list)
        List<InsurancePolicy> allPolicies = Arrays.asList(p1, p2, p3, p4);
        manager.findDuplicatePolicies(allPolicies);

        // Performance comparison
        manager.performanceTest();
    }
}
