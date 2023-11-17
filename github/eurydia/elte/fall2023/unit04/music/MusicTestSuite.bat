@ECHO OFF
set junitPath=.\lib\junit5all.jar
set checkthatPath=.\lib\checkthat.jar


@ECHO ON

javac -cp .;%junitPath%;%checkthatPath% github\eurydia\elte\fall2023\unit04\music\fan\*.java
javac -cp .;%junitPath%;%checkthatPath% github\eurydia\elte\fall2023\unit04\music\recording\*.java

javac -cp .;%junitPath%;%checkthatPath% github\eurydia\elte\fall2023\unit04\music\MusicTestSuite.java
java -jar %junitPath% execute -cp . -cp %checkthatPath% -c github.eurydia.elte.fall2023.unit04.music.MusicTestSuite