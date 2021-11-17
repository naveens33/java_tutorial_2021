package charactersequence;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){

        String name = "The House of Rare";
        /*
            for(int i=0;i<name.length();i++){
                System.out.println(name.charAt(i));
            }
        */

        System.out.println(name.length());

        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('e',5));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String last_name = "Jack";
        System.out.println(name+last_name);
        System.out.println(name.concat(last_name));
        System.out.println(name.replace('i','o'));

        System.out.println(name.substring(2,8));
        System.out.println(name.substring(2));
    }
}
