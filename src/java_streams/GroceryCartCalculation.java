package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroceryCartCalculation {
    public static void main(String[] args){
        List<Grocery> items = Arrays.asList(
                new Grocery(568,2000, false),
                new Grocery(901,180, true),
                new Grocery(333,596, true));

        List<Grocery> collectedItems = items.stream()
                .filter(item -> item.available)
                .sorted(Comparator.comparingInt((Grocery item) -> item.rate).reversed())
                .collect(Collectors.toList());

        collectedItems.forEach(item -> System.out.println(item.id));

        int totalAmount =  collectedItems.stream()
                .map(item -> item.rate)
                .reduce(0, (a,b) -> a+b);

        System.out.println(totalAmount);


    }
}
