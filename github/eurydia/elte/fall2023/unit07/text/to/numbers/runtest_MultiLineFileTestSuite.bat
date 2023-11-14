@ECHO OFF
set junitPath=.\lib\junit5all.jar
set checkthatPath=.\lib\checkthat.jar

set compiliationStep=javac -cp .;%junitPath%;%checkthatPath% .\github\eurydia\elte\fall2023\unit07\text\to\numbers\MultiLineFileTestSuite.java
set executionStep=java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit07.text.to.numbers.MultiLineFileTestSuite

@ECHO ON
%compilationStep% && %executionStep%