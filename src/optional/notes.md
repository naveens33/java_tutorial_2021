`Optional` is a class introduced in Java 8 (java.util.Optional) that is used to represent a value that might be absent. It is designed to help prevent NullPointerExceptions by providing a way to explicitly indicate that a value may not be present. `Optional` is a container object that may or may not contain a non-null value.

Here's a brief overview of `Optional` and its key features:

1. **Creation**: You can create an `Optional` object in a few different ways:
    - By calling `Optional.of(value)`, which creates an `Optional` that contains a non-null value.
    - By calling `Optional.ofNullable(value)`, which creates an `Optional` that contains the specified value if it is not null, or an empty `Optional` if it is null.
    - By calling `Optional.empty()`, which creates an empty `Optional`.

2. **Accessing the Value**: You can access the value contained in an `Optional` using several methods:
    - `get()`: Returns the value if it is present, or throws a `NoSuchElementException` if it is not.
    - `orElse(defaultValue)`: Returns the value if it is present, or returns the specified default value if it is not.
    - `orElseGet(Supplier)`: Returns the value if it is present, or returns the result of calling the specified `Supplier` if it is not.
    - `orElseThrow(Supplier)`: Returns the value if it is present, or throws the exception returned by the specified `Supplier` if it is not.

3. **Checking for Presence**: You can check whether an `Optional` contains a value using the following methods:
    - `isPresent()`: Returns true if the `Optional` contains a value, or false otherwise.
    - `ifPresent(Consumer)`: Executes the specified action with the value if it is present.

4. **Chaining Operations**: You can chain multiple operations using the `map`, `flatMap`, and `filter` methods:
    - `map(Function)`: Applies the specified function to the value if it is present, and returns an `Optional` containing the result.
    - `flatMap(Function)`: Applies the specified function to the value if it is present, and returns the result as an `Optional`.
    - `filter(Predicate)`: Returns an `Optional` containing the value if it is present and matches the specified predicate, or an empty `Optional` otherwise.

5. **Best Practices**:
    - Avoid using `Optional` as a field type in classes or as a method parameter type, as it can lead to unnecessary boxing and unboxing of values.
    - Prefer using `Optional` for return values, as it provides a clear indication to the caller that the value may be absent.

Here's an example of how to use `Optional`:

```java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create an Optional with a non-null value
        Optional<String> optional1 = Optional.of("Hello");

        // Create an Optional with a null value
        Optional<String> optional2 = Optional.ofNullable(null);

        // Create an empty Optional
        Optional<String> optional3 = Optional.empty();

        // Access the value if present
        if (optional1.isPresent()) {
            System.out.println(optional1.get()); // Output: Hello
        }

        // Use orElse to provide a default value
        System.out.println(optional2.orElse("Default")); // Output: Default

        // Use orElseGet to provide a default value using a Supplier
        System.out.println(optional3.orElseGet(() -> "Default")); // Output: Default

        // Use map to apply a function to the value if present
        Optional<String> optional4 = optional1.map(s -> s.toUpperCase());
        System.out.println(optional4.get()); // Output: HELLO

        // Use flatMap to apply a function that returns an Optional
        Optional<String> optional5 = optional1.flatMap(s -> Optional.of(s.toUpperCase()));
        System.out.println(optional5.get()); // Output: HELLO

        // Use filter to filter the value based on a predicate
        Optional<String> optional6 = optional1.filter(s -> s.startsWith("H"));
        System.out.println(optional6.isPresent()); // Output: true

        // Use ifPresent to execute an action if the value is present
        optional1.ifPresent(s -> System.out.println("Value is present: " + s)); // Output: Value is present: Hello
    }
}
```

This example demonstrates various ways to create and work with `Optional` objects. Note that using `Optional` in this way can help to make your code more robust and less prone to NullPointerExceptions. However, it's important to use `Optional` judiciously and avoid using it as a field type or method parameter type, as this can lead to unnecessary boxing and unboxing of values.

### Example1:


```java
import java.util.Optional;

public class OptionalDemo {

    public static Optional<Double> divide(double dividend, double divisor) {
        if (divisor == 0) {
            return Optional.empty(); // Indicates that the result is not available
        } else {
            return Optional.of(dividend / divisor); // Returns the result as an Optional
        }
    }

    public static void main(String[] args) {
        double dividend = 10;
        double divisor1 = 2;
        double divisor2 = 0;

        Optional<Double> result1 = divide(dividend, divisor1);
        Optional<Double> result2 = divide(dividend, divisor2);

        // Check if the result is available and print it if it is
        if (result1.isPresent()) {
            System.out.println("Result 1: " + result1.get());
        } else {
            System.out.println("Result 1 is not available");
        }

        if (result2.isPresent()) {
            System.out.println("Result 2: " + result2.get());
        } else {
            System.out.println("Result 2 is not available");
        }
    }
}
```

### Example2:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jim");
        names.add("Jack");

        // Find the first name that starts with 'J'
        Optional<String> firstName = names.stream()
                                          .filter(name -> name.startsWith("J"))
                                          .findFirst();

        // Print the result if it is available
        if (firstName.isPresent()) {
            System.out.println("First name starting with 'J': " + firstName.get());
        } else {
            System.out.println("No name starting with 'J' found");
        }
    }
}
```
