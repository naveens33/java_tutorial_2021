package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args){
        // Given a list of strings, use Java streams to create a new list where each string is converted to uppercase.

        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        //List<String> answer  = strings.stream().map(string -> string.toUpperCase(Locale.ROOT)).collect(Collectors.toList());

        List<String> answer  = strings.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(answer);

    }
}
