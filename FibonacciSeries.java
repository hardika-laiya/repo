import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args){
        int n = 10, a = 0, b = 1;

        System.out.println("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(a+" ");
            int next = a + b;
            a = b;
            b = next;
            
        }

        
    }
}