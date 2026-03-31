import java.util.*;
public class VotingSystem {
    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    // Cast a vote
    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }
    // Display votes in insertion order
    public void displayVoteOrder() {
        System.out.println("Votes in Order of Casting:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    // Display votes in sorted order (by candidate name)
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);
        System.out.println("\nVotes in Sorted Order:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");
        system.vote("Carol");
        system.vote("Bob");

        system.displayVoteOrder();
        system.displaySortedResults();
    }
}
