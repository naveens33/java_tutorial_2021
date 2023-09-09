package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Mike","Ryan", "Jessica","Anish","Somi");

        List<String> ans = names.stream()
                        .peek(name -> System.out.println("Before: "+name))
                                .map(String::toLowerCase)
                                        .peek(name -> System.out.println("After: "+name))
                                                .collect(Collectors.toList());
    }
}
