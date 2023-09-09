package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Ryan", "Jessica", "Anish", "Somi");

        List<String> ans  = names.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
