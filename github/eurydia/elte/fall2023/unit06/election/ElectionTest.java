package github.eurydia.elte.fall2023.unit06.election;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import github.eurydia.elte.fall2023.unit06.election.candidate.Candidate;

public class ElectionTest {
  @Test
  public void noVotes() {
    var election = new Election();

    assertEquals(Candidate.JACK, election.getWinner());
  }

  @Test
  public void candidateVoteCount() {
  }

  @ParameterizedTest
  @CsvSource({ "JACK, 15", "JILL, 15", "SAM, 15", "MAX, 15" })
  public void singleCandidate(Candidate c, int count) {
    var election = new Election();

    election.addVotes(c, count);
    assertEquals(c, election.getWinner());
  }

  @ParameterizedTest
  @CsvSource({ "JACK, JILL, 15", "JILL, SAM, 15", "SAM, MAX, 15" })
  public void twoCandidatesSameVoteCount(Candidate ca, Candidate cb, int count) {
    var election = new Election();

    election.addVotes(ca, count);
    election.addVotes(cb, count);
    assertEquals(ca, election.getWinner());
  }

  @ParameterizedTest
  @CsvSource({
      "0, 'JACK,JILL,SAM,MAX'",
      "1, 'JILL,SAM,MAX'",
      "2, 'JILL,SAM'",
      "3, 'JILL'",
      "4, ','",

  })
  public void candidateVoteCountAdvanced(int count, String cS) {
    var election = new Election();
    election.addVotes(Candidate.JACK, 1);
    election.addVotes(Candidate.JILL, 4);
    election.addVotes(Candidate.SAM, 3);
    election.addVotes(Candidate.MAX, 2);

    var splittedCandidateStrings = cS.split(",");
    var candidates = new Candidate[splittedCandidateStrings.length];
    for (int i = 0; i < splittedCandidateStrings.length; i++) {
      candidates[i] = Candidate.valueOf(splittedCandidateStrings[i]);
    }

    assertArrayEquals(candidates, election.getCandidatesWithMoreVotesThan(count));

  }

}
