
set junitPath=".\lib\junit5all.jar"
set checkthatPath=".\lib\checkthat.jar"

javac -cp ".;%junitPath%;%checkthatPath%" .\github\eurydia\elte\fall2023\unit07\text\to\numbers\SingleLineFileTestSuite.java
java -jar "%junitPath%" execute -cp . -cp "%checkthatPath%" -c github.eurydia.elte.fall2023.unit07.text.to.numbers.SingleLineFileTestSuite