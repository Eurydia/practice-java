# Compilation and execution

## Compilation 

The compilation step compiles one or more `.java` files into `.class` binaries using `javac`.

### Working directory

The working directory is important during compilation.

Imagine a simple Java project with three classes structured as follows:

```plaintext
root/
- project/
	- SomeClassA.java
	- worker/
		- SomeClassB.java
			- utils/
				- SomeClassC.java
```

The content of `SomeClassA.java` is written as:

```Java
package project;
import project.worker.SomeClassB;

public class SomeClassA {
	public static void main(String[] args) {}
}
```

Executing `javac` from `root/` directory will compile `SomeClassA.java` and `SomeClassB.java` files, which generate `SomeClassA.class` and `SomeClassB.class` binaries in their directories.

```bash
~/root
$ javac project/SomeClassA.java
```

However, executing `javac` from `root/project/` directory yields a compilation error.

```bash
~/root/project
$ javac SomeClassA.java
SomeClassA.java:3: error: package project.worker does not exist
import project.worker.SomeClassB;
```

This is because `javac` looked for `SomeClassB.java` in the wrong directory.
Instead of going `root/project/worker/` directory, it went to `root/project/project/worker/` directory which does not exist.

## Execution

It take a `.class` binary and execute it with `java`. 
The entry point is the `main` method.

Fully qualified names must be given to `java`.

```bash
~/root
$ java project.SomeClassA
$ java project.worker.SomeClassB
```

The execution will fail if the binary is located above the working directory.

```
~/root/project/worker
$ java project.SomeClassA
Error: Could not find or load main class project.SomeClassA    
Caused by: java.lang.ClassNotFoundException: project.SomeClassA
```

