import java.util.*;
/*Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by
 the N elements of the input array A.
 
 Output Format

A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array. 

There is **no space** after the minimum value in the output format. 
There is only a **single space** between the maximum and minimum value.

Example Input
Input 1:
5 1 2 3 4 5
Input 2:
4 10 50 40 80

Example Output
Output 1:
5 1
Output 2:
80 10*/

public class MinAndMaxOFArray{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]+" ");
        System.out.println(arr[0]);


        
    }
}