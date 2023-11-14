# practice-java

A collection of Java exercises.

## CLI

Compile a `.java` source file

```powershell
javac path\to\source\File.java
```

Execute a `.class` binary

```powershell
java fully.qualified.class.Name
```

Compile a `.java` source file with additional `.jar` archives

```powershell
javac -cp ".;path/to/jar/one.jar;path/to/jar/two.jar" path\to\source\File.java
```

Execute a `.class` binary with additional `.jar` archives

```powershell
java -jar path/to/archive.jar -cp . -c fully.qualified.class.name
```

Running Junit tests

```powershell
java -cp path/to/junit.jar execute -cp . -cp path/to/dep.jar -c fully.qualified.class.name
```

## Resources

- **Language specification (SE8)**: https://docs.oracle.com/javase/specs/jls/se8/html/index.html
- **Style convention (Sun Microsystem)**: https://www.oracle.com/technetwork/java/codeconventions-150003.pdf
- **Style convention (Google's Styleguide)**: https://google.github.io/styleguide/javaguide.html
