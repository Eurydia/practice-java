package github.eurydia.elte.fall2023.tests.lab07;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import github.eurydia.elte.fall2023.unit07.text.to.numbers.MultiLineFileStructureTest;
import github.eurydia.elte.fall2023.unit07.text.to.numbers.SingleLineFileStructureTest;
import textfile.StatisticsTest;
import textfile.lookup.FileContentTest;

@Suite
@SelectClasses({
		DataProcessorStructureTest.class, SingleLineFileStructureTest.class, MultiLineFileStructureTest.class,
		SumCheckerStructureTest.class, StatisticsTest.class, FileContentTest.class
})
public class Lab07TestSuite {
}
