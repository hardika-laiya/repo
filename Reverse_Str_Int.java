import java.util.*;
public class Reverse_Str_Int{
    public static String ReverseString(String input){
        String reversed = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        return reversed;
    }
    public static int reverseNumber(int num){
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args){
        String original = "hello";
        String result = ReverseString(original);
        System.out.println("Reversed String: "+ result);
        
        int origin = 12345;
        int res = reverseNumber(origin);
        System.out.println("Reversed number: "+ res);
    }
}