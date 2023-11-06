package elte_2023_fall.unit04.music;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import elte_2023_fall.unit04.music.fan.FanStructureTest;
import elte_2023_fall.unit04.music.recording.ArtistStructureTest;
import elte_2023_fall.unit04.music.recording.RecordLabelStructureTest;

import elte_2023_fall.unit04.music.fan.FanTest;
import elte_2023_fall.unit04.music.recording.ArtistTest;
import elte_2023_fall.unit04.music.recording.RecordLabelTest;

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
