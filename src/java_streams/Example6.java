package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        //Write a program to double each element in a list of integers using Java streams and the `map` function.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> answer = numbers.stream().map(number -> number+number).collect(Collectors.toList());
        System.out.println(answer);
    }
}
