package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        //Given a list of strings, use Java streams to filter out the strings that have length less than 5 characters.
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "grapes", "kiwi");

        List<String> answer = strings.stream().filter(string -> string.length() <5).collect(Collectors.toList());
        System.out.println(answer);
    }
}
