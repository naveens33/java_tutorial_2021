Generics in Java are a feature that allows classes, interfaces, and methods to be parameterized by one or more types. This enables the creation of classes and methods that can work with any type, rather than being limited to a specific type. Generics provide compile-time type safety and allow for more flexible and reusable code.

## Background

Before generics were introduced in Java 5, collections (e.g., `ArrayList`, `HashMap`) were designed to store objects of type `Object`. This meant that if you wanted to create a collection of `Integer` objects, you had to cast the objects retrieved from the collection to `Integer`, leading to potential runtime errors if the cast was incorrect. Generics were introduced to solve this issue by allowing collections to be parameterized by a type, enabling compile-time type checking and eliminating the need for casting.

## Generic Classes

To define a generic class, you use angle brackets (`<>`) to specify one or more type parameters when declaring the class. For example, here's how you can create a generic `Box` class that can hold objects of any type:

```java
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
```

In this example, `T` is a type parameter that can represent any type. The `Box` class can then be used with any type, such as `Integer`, `String`, or `Object`.

```java
Box<Integer> intBox = new Box<>(42);
Box<String> strBox = new Box<>("Hello, World!");
```

## Generic Methods

In addition to generic classes, Java also supports generic methods, which are methods that can work with any type. To define a generic method, you use the same angle bracket syntax to specify one or more type parameters when declaring the method. For example:

```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
```

In this example, the `printArray` method can work with arrays of any type. You can call this method with an array of `Integer`, `String`, or any other type.

```java
Integer[] intArray = {1, 2, 3, 4, 5};
String[] strArray = {"One", "Two", "Three", "Four", "Five"};

printArray(intArray); // prints 1 2 3 4 5
printArray(strArray); // prints One Two Three Four Five
```

## Type Erasure

Generics in Java use type erasure, which means that the type information is only available at compile time and is not present at runtime. This allows for backward compatibility with pre-Java 5 code, but it also imposes some limitations. For example, you cannot create an array of a generic type:

```java
// This will not compile
Box<Integer>[] boxes = new Box<Integer>[10];
```

Instead, you can use a generic collection, such as `ArrayList`, which can hold objects of any type:

```java
ArrayList<Box<Integer>> boxes = new ArrayList<>();
```

## Wildcards

Java also supports wildcards, which allow you to specify a range of types that a generic type parameter can represent. There are three types of wildcards: `?`, `? extends T`, and `? super T`.

The `?` wildcard represents an unknown type:

```java
Box<?> box = new Box<>(42);
```

The `? extends T` wildcard represents a range of types that are subclasses of `T`:

```java
Box<? extends Number> numberBox = new Box<>(42);
```

The `? super T` wildcard represents a range of types that are superclasses of `T`:

```java
Box<? super Integer> integerBox = new Box<>(42);
```

Wildcards are useful when you want to create a generic method or class that works with a range of types but does not need to know the exact type.
