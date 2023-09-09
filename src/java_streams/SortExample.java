package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Mike","Ryan", "Jessica","Anish","Somi");

        List<String> ans = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ans);

        ans = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
