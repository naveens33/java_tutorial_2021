package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Mike","Ryan", "Jessica","Mike","Anish","Anish","Somi");

        List<String> ans = names.stream().distinct().collect(Collectors.toList());
        System.out.println(ans);
    }
}
