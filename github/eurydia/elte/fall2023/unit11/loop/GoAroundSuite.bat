@ECHO OFF
set junitPath=".\lib\junit5all.jar"
set checkthatPath=".\lib\checkthat.jar"

@ECHO ON
javac -cp .;%junitPath%;%checkthatPath% .\github\eurydia\elte\fall2023\unit11\loop\*.java
javac -cp .;%junitPath%;%checkthatPath% .\github\eurydia\elte\fall2023\unit11\loop\iterator\*.java
java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit11.loop.GoAroundSuite