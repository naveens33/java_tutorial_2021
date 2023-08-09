package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        // Write a program to find the length of each word in a list of strings using Java streams and the map function.
        List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe");

        List<Integer> answer = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(answer);
    }
}
