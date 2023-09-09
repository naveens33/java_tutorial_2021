The `flatMap` operation in Java streams is used to transform and flatten a stream of elements into a new stream. It takes a function (`mapper`) that maps each element of the original stream to a new stream of elements (`Stream<R>`), and then flattens these streams into a single resulting stream.

Here's how `flatMap` works with an example:

Suppose you have a list of lists, where each inner list represents a group of items:

```java
List<List<Integer>> listOfLists = Arrays.asList(
    Arrays.asList(1, 2, 3),
    Arrays.asList(4, 5),
    Arrays.asList(6, 7, 8)
);
```

You want to use `flatMap` to flatten this structure into a single stream of integers. You can achieve this as follows:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );

        // Using flatMap to flatten the list of lists
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream()) // flatMap takes each inner list and converts it to a stream
                .collect(Collectors.toList());

        System.out.println(flattenedList);
    }
}
```

In this example:

1. We have a `List<List<Integer>>` called `listOfLists`, which contains three inner lists of integers.

2. We use `listOfLists.stream()` to create a stream of the outer list.

3. We apply the `flatMap` operation to each inner list using the lambda expression `list -> list.stream()`. This lambda converts each inner list into a stream of integers.

4. The `flatMap` operation flattens these individual streams into a single stream of integers.

5. Finally, we collect the elements of the resulting stream into a `List<Integer>` using `collect(Collectors.toList())`.

The output of the code will be:

```
[1, 2, 3, 4, 5, 6, 7, 8]
```

As you can see, the `flatMap` operation has flattened the list of lists into a single stream of integers, which contains all the individual elements. This is a powerful operation when dealing with nested collections or when you need to transform and flatten data structures.