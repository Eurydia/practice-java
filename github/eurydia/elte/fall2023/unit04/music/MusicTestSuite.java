package github.eurydia.elte.fall2023.unit04.music;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.eurydia.elte.fall2023.unit04.music.fan.FanStructureTest;
import github.eurydia.elte.fall2023.unit04.music.fan.FanTest;
import github.eurydia.elte.fall2023.unit04.music.recording.ArtistStructureTest;
import github.eurydia.elte.fall2023.unit04.music.recording.ArtistTest;
import github.eurydia.elte.fall2023.unit04.music.recording.RecordLabelStructureTest;
import github.eurydia.elte.fall2023.unit04.music.recording.RecordLabelTest;

@Suite
@SelectClasses({
                RecordLabelStructureTest.class,
                ArtistStructureTest.class,
                FanStructureTest.class,

                RecordLabelTest.class,
                ArtistTest.class,
                FanTest.class
})
public class MusicTestSuite {
}
