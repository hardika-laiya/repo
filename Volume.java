import java.util.*;
public class Volume{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();
        int A = n + 1;
        int vol = A * A * A;
        System.out.println(vol);
    }
}