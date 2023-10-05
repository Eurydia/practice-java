# Built-in functions

## I/O

```Java
System.out.println(String content);
System.out.println("Hi");
```

Print a string to `stdout`.
Automatically include a newline character.

```Java
System.out.printf(String content);
System.out.printf("2 + 2 = %d", 2 + 2)
```

Print a string to `stdout`.
The string is outputted as is without new line character.
It also support string formatting without `String.format()`

Alternatively, a string can be printed to `stderr` using `System.err.println()` and `System.err.printf()`.

## Type conversion

### Type casting

Java integral types may be implicitly casted to one another.

```Java
byte p = 12;  
short q = p;  
int r = q;  
long s = r;  
float t = s;  
double u = t;  
```
