import java.util.*;
public class PalindromeChecker{
     public static boolean isPalindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args){
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}