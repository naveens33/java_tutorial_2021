The `peek` operation in Java streams is an intermediate operation that allows you to perform an action on each element of the stream while still keeping the stream intact. It's often used for debugging purposes, logging, or side-effecting operations that don't change the content of the stream. The `peek` operation does not modify the stream; it merely provides a way to observe the elements as they pass through the stream pipeline.

Here's how `peek` works with an example:

Suppose you have a list of integers and you want to use `peek` to print each element before performing other stream operations:

```java
import java.util.Arrays;
import java.util.List;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .peek(n -> System.out.println("Before: " + n)) // Use peek to log each element
                .map(n -> n * n) // Square each element
                .peek(n -> System.out.println("After: " + n)) // Use peek to log each element again
                .toList(); // Collect the result into a list

        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
```

In this example:

1. We have a list of integers called `numbers`.

2. We create a stream from the list using `numbers.stream()`.

3. We use the `peek` operation twice in the stream pipeline. The first `peek` logs each element before they are squared, and the second `peek` logs each element after squaring.

4. Inside the `peek` operations, we use lambda expressions to perform actions on the elements. In this case, we print "Before" and "After" messages along with the element's value.

5. We use the `map` operation to square each element.

6. Finally, we collect the squared elements into a list using the `toList()` collector.

When you run this code, you will see the following output:

```
Before: 1
After: 1
Before: 2
After: 4
Before: 3
After: 9
Before: 4
After: 16
Before: 5
After: 25
Squared numbers: [1, 4, 9, 16, 25]
```

As you can see, the `peek` operation allows you to observe and log the elements at two different points in the stream pipeline without altering the stream's content. This can be useful for debugging and understanding how the elements are being processed within the stream.