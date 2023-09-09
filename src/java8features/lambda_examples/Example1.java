package java8features.lambda_examples;

interface CheckInterface{
    public abstract boolean isLetter(String str);
}

public class Example1 {
    public static void main(String[] args){
        String str = "Processfinishedwithexitcod1e";

        CheckInterface obj = (str1 -> str1.matches("^[a-zA-Z]*$"));

        System.out.println(obj.isLetter(str));
    }
}
