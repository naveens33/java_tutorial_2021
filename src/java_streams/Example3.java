package java_streams;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args){
        //Given a list of integers, use Java streams to find the sum of all even numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(number -> number % 2 == 0).reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }
}
