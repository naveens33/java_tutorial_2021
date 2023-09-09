package java_streams;

import java.util.*;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        /*
        You have a list of user names, where each user name is represented as a string.
        However, the list may contain duplicate user names.
        Your task is to process this list and create a new collection that contains only the unique user names,
        eliminating any duplicates.
         */
        List<String> li = Arrays.asList("Mike","Jessica","Amy","Mike","Anish", "Somi","Jessica","mike");
        Set<String> ans = li.stream()
                .collect(Collectors.toSet());
        System.out.println(ans);

        /*
        What if the user names has duplicate name with different case
         */
        Set<String> ans1 = li.stream()
                .map(name -> name.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        System.out.println(ans1);

    }
}
