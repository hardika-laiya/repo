import java.util.*;
public class Eligible_ForVote{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Age:");
        int age = scn.nextInt();
        if(age >= 18){
            System.out.println("Eligible for Vote.");
        }else{
            System.out.println("Not Eligible for Vote.");
        }

    }
}