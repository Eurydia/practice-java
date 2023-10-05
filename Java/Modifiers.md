# Modifiers

## Access modifiers

Access Modifiers control the access level.

### Access modifiers on attributes, methods, and constructors 

There three access modifiers, and there are four different access levels.

#### `public` modifier on attributes and methods

```Java
public class ModifierPublicExample {
	public int publicInteger;
	public void publicMethod() {}
	public ModifierPublicExample() {}
}
```

The `publicInteger` attribute and `publicMethod` method are accessible by any other class.

#### `protected` modifier on attributes and methods

```Java
public class ModifierProtectedExample {
	protected int protectedInteger;
	protected void protectedMethod() {}
	protected ModifierProtectedExample() {}
}
```

The `protectedInteger` attribute and `protectedMethod` method are accessible to classes within the same package of `ModifierProtectedExample` and subclasses of `ModifierProtectedExample`.

In Java, the term "same package" is best demonstrated as the follows:

```plaintext
./
- example/
	- test/
		- ModifierProtectedExample.java
		- TestA.java
		- deepertest/
			- TestB.java
	- TestC.java
	- more_test/
		- TestD.java
```

The `example.test.ModifierProtectedExample` class is in the same package as `example.test.TestA`.

The `example.test.deepertest.TestB` class is not recognized as being in the same package as `example.test.ModifierProtectedExample`.

#### `private` modifier on attributes and methods

```Java
public class ModifierPrivateExample {
	private int privateInteger;
	private void privateMethod() {};
	private ModifierPrivateExample() {};
}
```

The `privateInteger` attribute and `privateMethod` method 
are accessible within `ModifierPrivateExample` class.

A private constructor carries a semantic meaning that instantiations from outside of the class is restricted.
Such behavior is present in [Singleton design pattern](https://en.wikipedia.org/wiki/Singleton_pattern).

#### Default modifier on attributes and methods

```Java
public class ModifierDefaultExample {
	int defaultInteger;
	void defaultMethod() {};
	ModifierDefaultExample() {};
}
```

The `defaultInteger` attribute and `defaultMethod` method 
are accessible to classes within the same package as `ModifierDefaultExample`.

### Access modifiers on classes

There one access modifier, and two access levels.

#### `public` modifier on classes

```Java
public class ModifierClassPublicExample {}
```

The `ModifierClassPublicExample` class is accessible to any other class.

#### Default modifier on classes

```Java
class ModifierClassDefaultExample {}
```

The `ModifierClassDefaultExample` class is accessible to classes within the same package as `ModifierClassDefaultExample`.

## Non-access modifiers

Non-access modifiers do not dictate access levels, but they provide other functionalities.

### Non-access modifiers on attributes and methods

#### `final` modifier on attributes and methods

```java
public ModifierFinalExample {
	public final int finalInteger = 0;
	public final void finalMethod() {}
}
```

The `finalInteger` attribute and `finalMethod` method cannot be overridden.

#### `static` modifier on attributes and methods

```java
public ModifierStaticExample {
	public static int staticInteger = 0;
	public static void staticMethod {}

    public ModifierStaticExample() {
        staticInteger++;
    }

    public void getCount() {
        System.out.println(staticInteger);
    }

    public static void main(String[] args) {
        Example a = new Example();
        Example b = new Example();

        a.getCount(); // 2
        b.getCount(); // 2
    }
}
```

The `staticInteger` attribute is a class attribute and `staticMethod` method is a class method.

Unlike instance attributes, class attributes can be accessed without `this` keyword.

#### `abstract` modifier on methods

```java
public abstract ModifierAbstractExample {
	public abstract void abstractMethod();
}
```

The `abstract` modifier can only be used on methods of an abstract class.
Abstract methods do not have a body.

### Non-access modifiers on classes

There are two non-access modifiers which can be used on classes.

#### `final` modifier on classes

```java
public final ModifierClassFinalExample {}
```

The `ModifierClassFinalExample` class cannot be inherited by other classes.

#### `abstract` modifier on classes

```java
public abstract ModifierClassFinalExample {}
```

The `ModifierClassFinalExample` class cannot be used to create objects.

## Order of modifiers

Order of modifiers according to [Google's Java style guide](https://google.github.io/styleguide/javaguide.html#s4.8.7-modifiers).

```plaintext
public | protected | private
abstract 
default
static
final
transient
volatile
synchronized
native
strictfp
```