import java.util.*;
public class PrimeCheck{
    public static void main(String[] args){
        int num = 17;
        boolean isPrime = false;
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println(num + "isPrime? "+ isPrime);

    }
}