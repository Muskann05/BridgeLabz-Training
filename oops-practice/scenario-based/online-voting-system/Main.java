public class Main {
    public static void main(String[] args) {

        ElectionService election = new ElectionServiceImpl();

        // Voter Registration
        election.registerVoter(new Voter(1, "Rahul"));
        election.registerVoter(new Voter(2, "Anita"));

        // Candidate Management
        election.addCandidate(new Candidate(101, "Candidate X"));
        election.addCandidate(new Candidate(102, "Candidate Y"));

        try {
            election.castVote(1, 101);
            election.castVote(2, 102);
            election.castVote(1, 102); // Duplicate vote
        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        election.declareResult();
    }
}
