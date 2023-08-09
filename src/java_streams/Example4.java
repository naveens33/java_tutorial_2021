package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args){
        // Create a program that takes a list of names and returns a new list containing the initials of each name using Java streams.
        List<String> names = Arrays.asList("John Doe", "Jane Smith", "Alice Johnson");
        List<String> answer = names.stream().map(string -> {
            String[] stringArr = string.split(" ");
            return ""+stringArr[0].charAt(0)+stringArr[1].charAt(0);
        }).collect(Collectors.toList());
        System.out.println(answer);
    }
}
