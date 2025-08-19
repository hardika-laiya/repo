import java.util.*;
/*Q1. Sum the Array
Problem Description

Write a program to print 
sum of elements of the input array A of size N.

 */
public class SumTheArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the Length of the Array:- ");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+ n +" Values of the Array: ");
        for(int i=0; i<arr.length; i++){

            arr[i] = scn.nextInt();
        }
     
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

    }
}