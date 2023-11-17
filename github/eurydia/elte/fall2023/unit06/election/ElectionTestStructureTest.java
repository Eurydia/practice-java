package github.eurydia.elte.fall2023.unit06.election;

import static check.CheckThat.*;
import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class ElectionTestStructureTest {
    @BeforeAll
    public static void init() {
        CheckThat.theClass("github.eurydia.elte.fall2023.unit06.election.ElectionTest")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL);
    }

    @Test
    public void noArgTestMethods() {
        it.hasNoArgTestMethods(
                "noVotes",
                "candidateVoteCount");
    }

    @Test
    public void methodCandidateVoteCountAdvanced() {
        it.hasTestMethodWithParams("candidateVoteCountAdvanced", "int", "String");
    }

    @Test
    public void methodSingleCandidate() {
        it.hasTestMethodWithParams("singleCandidate",
                "github.eurydia.elte.fall2023.unit06.election.candidate.Candidate", "int");
    }

    @Test
    public void methodTwoCandidatesSameVoteCount() {
        it.hasTestMethodWithParams("twoCandidatesSameVoteCount",
                "github.eurydia.elte.fall2023.unit06.election.candidate.Candidate",
                "github.eurydia.elte.fall2023.unit06.election.candidate.Candidate", "int");
    }
}
