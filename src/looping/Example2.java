package looping;
/*
Armstrong number
   153 =  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */
public class Example2 {
    public static void main(String[] args){
     int num = 153;
     int ans = 0;
     while(num!=0){
         int temp =  num%10;
         ans  = ans + (temp*temp*temp);
         num = num/10;
     }
     System.out.println(ans);
    }
}
