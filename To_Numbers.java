import java.util.*;
public class To_Numbers{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter a Starting number");
        int a = scn.nextInt();

        System.out.println("Enter last digit:");
        int b = scn.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.println(i);     
        }
    }
}