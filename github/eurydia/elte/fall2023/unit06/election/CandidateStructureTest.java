package github.eurydia.elte.fall2023.unit06.election;

import static check.CheckThat.Condition.*;
import org.junit.jupiter.api.*;
import check.CheckThat;

public class CandidateStructureTest {
    @Test
    public void testEnum() {
        CheckThat.theEnum("github.eurydia.elte.fall2023.unit06.election.candidate.Candidate")
                .thatIs(FULLY_IMPLEMENTED, INSTANCE_LEVEL, VISIBLE_TO_ALL)
                .hasEnumElements("JACK", "JILL", "SAM", "MAX");
    }
}
