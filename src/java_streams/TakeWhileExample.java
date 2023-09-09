package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(43,54,88,23,99,100);
        List<Integer> ans = numbers.stream()
                .takeWhile(number -> number <60)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
