Functional interfaces are a key concept in Java, introduced in Java 8, and they play a central role in enabling the use of lambda expressions and method references. A functional interface is an interface that contains only one abstract method. This single abstract method serves as the functional contract that can be implemented by lambda expressions or method references. Functional interfaces are often used to represent functions or actions that can be passed around as arguments or returned as values from other methods.

Here's an example of a functional interface along with a few examples of how to use it:

```java
@FunctionalInterface
interface MyFunction {
    int apply(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Example 1: Implementing a functional interface using a lambda expression
        MyFunction add = (a, b) -> a + b;
        int sum = add.apply(5, 3);
        System.out.println("Sum: " + sum);

        // Example 2: Implementing a functional interface using a method reference
        MyFunction subtract = FunctionalInterfaceExample::subtractNumbers;
        int difference = subtract.apply(10, 4);
        System.out.println("Difference: " + difference);
    }

    // A static method that matches the functional interface signature
    static int subtractNumbers(int a, int b) {
        return a - b;
    }
}
```

In this example:

1. We define a functional interface named `MyFunction`, which declares a single abstract method `apply(int a, int b)`.

2. We annotate the `MyFunction` interface with `@FunctionalInterface` to indicate that it is intended to be used as a functional interface. While this annotation is not strictly required, it helps prevent accidental addition of more abstract methods to the interface.

3. In the `FunctionalInterfaceExample` class, we provide two examples of implementing the `MyFunction` interface:

    - Example 1 uses a lambda expression to define an `add` function that computes the sum of two numbers.

    - Example 2 uses a method reference to implement a `subtract` function that computes the difference between two numbers. The method `subtractNumbers` matches the functional interface signature, so it can be used as a method reference.

Functional interfaces are commonly used when working with Java's functional programming features, such as lambda expressions and method references. They provide a way to define and use custom functional contracts in a type-safe manner, making code more expressive and readable.