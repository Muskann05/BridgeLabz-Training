import java.util.ArrayList;

public class ElectionServiceImpl implements ElectionService {

    private ArrayList<Voter> voters = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();

    @Override
    public void registerVoter(Voter voter) {
        voters.add(voter);
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    @Override
    public void castVote(int voterId, int candidateId) throws DuplicateVoteException {

        Voter selectedVoter = null;
        Candidate selectedCandidate = null;

        for (Voter v : voters) {
            if (v.getVoterId() == voterId) {
                selectedVoter = v;
                break;
            }
        }

        for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                selectedCandidate = c;
                break;
            }
        }

        if (selectedVoter.hasVoted()) {
            throw new DuplicateVoteException("Duplicate vote not allowed!");
        }

        selectedCandidate.addVote();
        selectedVoter.setHasVoted(true);
    }

    @Override
    public void declareResult() {
        System.out.println("\nElection Results:");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " : " + c.getVotes() + " votes");
        }
    }
}
