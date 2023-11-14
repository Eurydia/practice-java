@ECHO OFF
set junitPath=".\lib\junit5all.jar"
set checkthatPath=".\lib\checkthat.jar"

set compilationStep=javac -cp .;%junitPath%;%checkthatPath% .\github\eurydia\elte\fall2023\unit07\text\to\numbers\SingleLineFileTestSuite.java
set executionStep=java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit07.text.to.numbers.SingleLineFileTestSuite

@ECHO ON
%compilationStep% && %executionStep%
