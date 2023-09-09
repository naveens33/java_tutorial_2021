package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Example11 {
    public static void main(String[] args) {
        /*
        Sort the words in the given sentence by their lengths in ascending order and print the sorted sentence.
         */
        String sentence = "The journey of a thousand miles begins with a single step";
        String[] words = sentence.split(" ");

        String ans = Arrays.stream(words)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.joining(" "));
        System.out.println(ans);
    }
}
