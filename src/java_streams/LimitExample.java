package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LimitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike","Ryan", "Jessica","Anish","Somi");

        List<String> limitedList = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(limitedList);

        //after desc sort get first 3 person

        limitedList = names.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(limitedList);
    }
}
