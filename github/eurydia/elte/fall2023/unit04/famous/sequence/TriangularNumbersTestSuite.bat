@ECHO OFF
set junitPath=.\lib\junit5all.jar
set checkthatPath=.\lib\checkthat.jar

@ECHO ON

javac -cp .;%junitPath%;%checkthatPath% github\eurydia\elte\fall2023\unit04\famous\sequence\TriangularNumbers*.java
java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit04.famous.sequence.TriangularNumbersTestSuite
