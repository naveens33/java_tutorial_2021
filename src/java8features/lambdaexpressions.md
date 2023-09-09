Lambda expressions were one of the most significant additions to the Java programming language in Java 8. They provide a concise way to represent a block of code as an object, allowing you to pass functions as arguments to methods, define inline implementation of a functional interface, and make your code more expressive and readable. Here are some detailed notes on Lambda Expressions in Java:

1. **Syntax**:
    - Lambda expressions are defined using the `->` arrow notation, also known as the lambda operator.
    - The syntax consists of parameters (if any), an arrow (`->`), and the body of the lambda expression.
    - For example, `(x, y) -> x + y` represents a lambda expression that takes two parameters `x` and `y` and returns their sum.

2. **Functional Interfaces**:
    - Lambda expressions are typically used to implement functional interfaces, which are interfaces with a single abstract method (SAM).
    - For instance, the `Runnable` interface with the `run()` method can be implemented using a lambda expression.

3. **Parameter Types**:
    - In many cases, you can omit the parameter types in a lambda expression, and the compiler will infer them based on the context.
    - For example, `(a, b) -> a + b` is valid, and the compiler infers that `a` and `b` are integers.

4. **Method References**:
    - Method references are a shorthand notation for lambda expressions when you're calling an existing method.
    - For example, `System.out::println` is a method reference equivalent to `(x) -> System.out.println(x)`.

5. **Scope**:
    - Lambda expressions can access variables from their enclosing scope. These variables must be effectively final or explicitly declared as `final`.
    - This concept is known as "closure."

6. **Use Cases**:
    - Lambda expressions are commonly used for stream operations like `map`, `filter`, and `reduce` to process collections in a functional style.
    - They are useful for defining event handlers and callbacks in GUI programming.
    - Lambda expressions simplify code when working with concurrency and parallelism.

7. **Functional Programming**:
    - Lambda expressions promote functional programming practices in Java, making it easier to write code that is more concise and declarative.

8. **Consumer, Predicate, Function**:
    - Java 8 introduced several functional interfaces in the `java.util.function` package, such as `Consumer`, `Predicate`, and `Function`, which are often used in conjunction with lambda expressions.
    - For example, you can use a lambda expression to define a predicate for filtering elements in a list.

   ```java
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
   List<Integer> evenNumbers = numbers.stream()
       .filter((n) -> n % 2 == 0)
       .collect(Collectors.toList());
   ```

9. **Readability and Expressiveness**:
    - Lambda expressions can make code more readable by expressing the intention of the code directly, without the need for verbose anonymous inner classes.

10. **Limitations**:
    - Lambda expressions can only be used with functional interfaces. A functional interface can have only one abstract method, but it can have multiple default or static methods.

11. **Examples**:
    - Here are a few more examples of lambda expressions in Java:

    ```java
    // Runnable interface
    Runnable task = () -> System.out.println("Hello, Lambda!");

    // Comparator interface for sorting
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    names.sort((a, b) -> a.compareTo(b));

    // Custom functional interface
    MyFunctionalInterface func = (x, y) -> x * y;
    ```

Lambda expressions have greatly improved the conciseness and power of Java, making it more competitive in modern programming paradigms, such as functional programming and asynchronous programming.