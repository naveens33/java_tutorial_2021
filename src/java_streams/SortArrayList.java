package java_streams;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortArrayList {
    public static void main(String[] args){
        List<Integer> li = Arrays.asList(54,65,100,9,67);
        //Sort the list in ascending order
        List<Integer> ans  = li.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ans);
        //Sort the list in descending order
        ans = li.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(ans);

    }
}
