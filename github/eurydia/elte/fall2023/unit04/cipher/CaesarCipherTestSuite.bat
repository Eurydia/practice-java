@ECHO OFF
set junitPath=.\lib\junit5all.jar
set checkthatPath=.\lib\checkthat.jar

set executionStep=

@ECHO ON

javac -cp .;%junitPath%;%checkthatPath% github\eurydia\elte\fall2023\unit04\cipher\CaesarCipher*.java
java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit04.cipher.CaesarCipherTestSuite