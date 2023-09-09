1. **Introduction**:
    - Streams in Java are a sequence of elements supporting sequential and parallel aggregate operations.
    - They provide a functional-style approach to work with collections of data.
    - Introduced in Java 8 as part of the Stream API.

2. **Creating Streams**:
    - Streams can be created from various data sources, including collections, arrays, or directly from individual elements.
    - Common methods to create streams: `stream()`, `parallelStream()`, `of()`, `generate()`, and `iterate()`.

3. **Functional Operations**:
    - Streams support various functional-style operations to process data, including:
        - **Filter**: Filters elements based on a given predicate.
          - The syntax for the `filter` operation is as follows:
            - ```Stream<T> filteredStream = stream.filter(predicate);```
            - `T` represents the type of elements in the stream.
            - `predicate` is a functional interface of type `T -> boolean` that defines the condition for filtering elements. It returns true for elements that should be included and false for elements that should be excluded.
        - **Map**: Transforms elements to another type using a given function.
          - The syntax for the `map` operation is as follows:
            - ```Stream<R> mappedStream = stream.map(function);```
            - `R` represents the type of elements in the new stream after applying the mapping function. 
            - `function` is a functional interface of type `T -> R`, where T is the type of elements in the original stream and R is the type of elements in the mapped stream. The function takes an element of type T and returns an element of type R.
        - **Reduce**: Performs a binary operation on elements to produce a single result.
          - The syntax for the `reduce` operation is as follows:
            - ```T result = stream.reduce(identity, accumulator);```
            - `T` represents the type of the final result.
            - `identity` is an initial value of type `T`. It serves as the initial accumulator value and is returned when the stream is empty.
            - `accumulator` is a binary operator of type `(T, T) -> T` that combines two elements of the stream to produce a new result.
        - **Collect**: Accumulates elements into a collection or a summary.
        - **Sort**: Sorts elements based on natural order or a provided comparator.
        - **Distinct**: Filters out duplicate elements.
        - **Limit**: Limits the number of elements in the stream.
        - **Skip**: Skips a specified number of elements in the stream.

4. **Intermediate and Terminal Operations**:
    - Stream operations can be classified as intermediate and terminal operations.
    - Intermediate operations (e.g., `filter`, `map`, `sorted`) return a new stream and allow chaining.
    - Terminal operations (e.g., `forEach`, `collect`, `reduce`) produce a result or a side effect and end the stream.

5. **Lazy Evaluation**:
    - Streams use lazy evaluation to optimize performance.
    - Intermediate operations are only executed when a terminal operation is called.
    - This allows avoiding unnecessary computation on large datasets.

6. **Parallel Streams**:
    - Streams can be easily parallelized to take advantage of multi-core processors.
    - Parallel streams use the `parallelStream()` method to perform operations concurrently on data chunks.

7. **Auto-Closable Resources**:
    - When using streams with I/O operations, prefer using try-with-resources to ensure resources are properly closed.
    - For example, when reading from files or network streams.

8. **Performance Considerations**:
    - Streams can improve code readability and conciseness but may not always outperform traditional loops in terms of performance.
    - Choose streams when readability and maintainability are more critical than micro-optimization.

9. **Stream API vs. Collection API**:
    - The Stream API focuses on processing elements and performing operations on data, while the Collection API deals with data storage and manipulation.
    - Collections are eagerly loaded, whereas streams are lazily evaluated.

10. **Stateful and Stateless Operations**:
    - Stream operations can be stateful or stateless.
    - Stateless operations (e.g., `filter`, `map`) do not depend on previous elements, making them easy to parallelize.
    - Stateful operations (e.g., `sorted`, `distinct`) depend on the order or uniqueness of elements and may be harder to parallelize.

Java streams are a powerful tool for data processing, and understanding how to use them effectively can greatly improve code quality and maintainability. They provide a declarative, functional programming approach that complements the traditional imperative style of coding in Java.

### Programs

**Question 1:** Given a list of strings, use Java streams to create a new list where each string is converted to uppercase.

Input:
```
List<String> strings = Arrays.asList("apple", "banana", "cherry");
```
Output:
```
["APPLE", "BANANA", "CHERRY"]
```

**Question 2:** Write a program to find the length of each word in a list of strings using Java streams and the `map` function.

Input:
```
List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");
```
Expected Output:
```
[3, 8, 3, 7]
```

**Question 3:** Given a list of integers, use Java streams to find the sum of all even numbers.

Input:
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
```
Expected Output:
```
30
```

**Question 4:** Create a program that takes a list of names and returns a new list containing the initials of each name using Java streams.

```
List<String> names = Arrays.asList("John Doe", "Jane Smith", "Alice Johnson");
```
Expected Output:
```
["JD", "JS", "AJ"]
```

**Question 5:** Given a list of strings, use Java streams to filter out the strings that have length less than 5 characters.

Input:
```
List<String> strings = Arrays.asList("apple", "banana", "cherry", "grapes", "kiwi");
```
Expected Output:
```
["kiwi"]
```

**Question 6:** Write a program to double each element in a list of integers using Java streams and the `map` function.

Input:
```
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
```
Expected Output:
```
[2, 4, 6, 8, 10]
```

**Question 7:** Given a list of integers, use Java streams to find the square root of each number and round it to the nearest integer.

Input:
```
List<Double> numbers = Arrays.asList(9.0, 16.0, 25.0, 36.0);
```
Expected Output:
```
[3, 4, 5, 6]
```

**Question 8:** Create a program that takes a list of sentences and returns a new list with the number of words in each sentence using Java streams.

Input:
```
List<String> sentences = Arrays.asList("Hello world", "Java programming is fun", "Stream map example");
```
Expected Output:
```
[2, 4, 3]
```

**Question 9:** Given a list of strings, use Java streams to concatenate them into a single comma-separated string.

Input:
```
List<String> strings = Arrays.asList("apple", "banana", "cherry");
```
Expected Output:
```
"apple, banana, cherry"
```

**Question 10:** Write a program that takes a list of numbers as strings, converts them to integers using Java streams, and returns the sum of all the numbers.

Input:
```
List<String> numberStrings = Arrays.asList("5", "10", "15", "20");
```
Expected Output:
```
50
```


In Java, the `Stream` class provides three types of operations: intermediate operations, terminal operations, and short-circuiting operations. These operations allow you to perform various transformations and computations on streams of data. Here's an overview of each type:

1. **Intermediate Operations:**

   Intermediate operations in Java streams are used to transform, filter, or manipulate the elements in a stream. These operations return a new stream that can be further processed. Here is a list of common intermediate operations in the `Stream` class:

1. `filter(Predicate<T> predicate)`: Returns a new stream consisting of elements that match the given predicate.

2. `map(Function<T, R> mapper)`: Returns a new stream by applying the given function to each element.

3. `flatMap(Function<T, Stream<R>> mapper)`: Returns a new stream by applying a function that produces a stream for each element and then flattening the resulting streams into a single stream.

4. `distinct()`: Returns a new stream with distinct elements based on their `equals` method.

5. `sorted()`: Returns a new stream with elements sorted in natural order.

6. `sorted(Comparator<T> comparator)`: Returns a new stream with elements sorted according to the provided comparator.

7. `peek(Consumer<T> action)`: Returns a new stream that performs an action on each element as they are consumed from the resulting stream.

8. `limit(long maxSize)`: Returns a new stream containing the first `maxSize` elements of the original stream.

9. `skip(long n)`: Returns a new stream after skipping the first `n` elements of the original stream.

10. `takeWhile(Predicate<T> predicate)`: Returns a new stream of elements that match the predicate until the first element that does not match is encountered.

11. `dropWhile(Predicate<T> predicate)`: Returns a new stream of elements after dropping elements that match the predicate until the first element that does not match is encountered.

12. `mapToInt(ToIntFunction<T> mapper)`, `mapToLong(ToLongFunction<T> mapper)`, `mapToDouble(ToDoubleFunction<T> mapper)`: Specialized mapping operations for primitive streams.

13. `boxed()`: Converts a primitive stream to a stream of boxed values (e.g., `IntStream` to `Stream<Integer>`).

These intermediate operations allow you to manipulate the data within a stream before applying terminal operations to obtain a result. You can chain multiple intermediate operations together to create complex data transformations.

2. **Terminal Operations:**

   Terminal operations are operations that produce a result or a side effect. These operations trigger the processing of the stream and cannot be chained together. Terminal operations are used to obtain a final result from a stream, such as collecting the elements into a collection, counting, or finding the minimum or maximum value. Some common terminal operations include:

    - `forEach(Consumer<T> action)`: Performs an action on each element in the stream.
    - `collect(Collector<T, A, R> collector)`: Collects elements into a collection or aggregation.
    - `reduce(identity, accumulator)`: Aggregates elements into a single result.
    - `min(Comparator<T> comparator)`: Finds the minimum element.
    - `max(Comparator<T> comparator)`: Finds the maximum element.
    - `count()`: Counts the number of elements in the stream.
    - `anyMatch(Predicate<T> predicate)`: Checks if any element matches a predicate.
    - `allMatch(Predicate<T> predicate)`: Checks if all elements match a predicate.
    - `noneMatch(Predicate<T> predicate)`: Checks if no elements match a predicate.
    - `toArray`: Collects the elements of the stream into an array.
    - `forEachOrdered`: Performs an action on each element of the stream in a defined order, maintaining the order of the original stream.

3. **Short-Circuiting Operations:**

   Short-circuiting operations are a subset of terminal operations that allow for early termination of the stream processing based on certain conditions. These operations can improve performance when searching for elements or checking conditions in a large stream. Common short-circuiting operations include:

    - `findAny()`: Returns the first element found and may not process all elements.
    - `findFirst()`: Returns the first element found and may not process all elements.
    - `anyMatch(Predicate<T> predicate)`: Returns `true` as soon as any element matches the predicate.
    - `allMatch(Predicate<T> predicate)`: Returns `false` as soon as any element fails to match the predicate.
    - `noneMatch(Predicate<T> predicate)`: Returns `true` as soon as any element matches the predicate.

These three types of operations in the `Stream` class allow you to perform a wide range of data processing tasks in a concise and expressive manner.