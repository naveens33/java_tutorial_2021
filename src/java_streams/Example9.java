package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        //Given a list of strings, use Java streams to concatenate them into a single comma-separated string.
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        String answer = strings.stream().collect(Collectors.joining(","));
        //String answer = String.join(",", strings);
        System.out.println(answer);
    }
}
