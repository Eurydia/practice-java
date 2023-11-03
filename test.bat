@ECHO OFF
set PROPS=%~1
set OPTS=%~2
set TARGET1="elte_2023_fall\assignment\planet\structure\PlanetCompulsoryTestSuite.java"
set TARGET2="elte_2023_fall.assignment.planet.structure.PlanetCompulsoryTestSuite"
if not "%~3"=="" (
    set TARGET1="%~3"
    set TARGET2="%~4"
)
@ECHO ON

javac -cp ".;.\lib\junit5all.jar;.\lib\checkthat.jar" %TARGET1%
java -javaagent:checkagent.jar -jar junit5all.jar execute -E junit-vintage --disable-banner -cp . -cp checkthat.jar -c %TARGET2%

