package github.eurydia.elte.fall2023.unit06.election;

import github.eurydia.elte.fall2023.unit06.election.candidate.Candidate;

public class Election {
  private int[] voteCounts;

  public Election() {
    this.voteCounts = new int[4];
  }

  public void addVote(Candidate c) {
    this.voteCounts[c.ordinal()]++;
  }

  public void addVotes(Candidate c, int count) {
    this.voteCounts[c.ordinal()] += count;

  }

  private int getCandidateCountWithMoreVotesThan(int count) {

    int candidateCount = 0;

    for (Candidate c : Candidate.values()) {
      if (this.voteCounts[c.ordinal()] > count) {
        candidateCount++;
      }
    }
    return candidateCount;

  }

  public Candidate[] getCandidatesWithMoreVotesThan(int count) {

    var candidates = new Candidate[this.getCandidateCountWithMoreVotesThan(count)];

    int index = 0;
    for (Candidate c : Candidate.values()) {
      if (this.voteCounts[c.ordinal()] > count) {
        candidates[index] = c;
        index++;
      }

    }
    return candidates;

  }

  public Candidate getWinner() {
    for (Candidate c : Candidate.values()) {
      if (c.ordinal() == this.getWinningIdx()) {
        return c;
      }
    }

    return Candidate.JACK;

  }

  private int getWinningIdx() {
    int winner = 0;

    for (int i = 1; i < Candidate.values().length; i++) {
      if (this.voteCounts[i] > this.voteCounts[winner]) {
        winner = i;
      }
    }
    return winner;
  }

}
