import java.util.*;
/*
 * Given an integer array A (Array of bigInt). Find and return the frequency of number B in array A.
 * Input Format

The first argument is a bigInt array A.
The second argument is an integer B.

Output Format
Return the frequency of B in the array A.

Example Input
Input 1:-
A = [1, 1, 2, 4, 2]
B = 2
Input 2:-
A = [4, 2, 3, 4, 4]
B = 4

Example Output
Output 1:-
2
Output 2:-
3
 */
public class CountFrequencyOFX{

    public int CountF(int A[], int B){
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == B){
            count++;
            }
        }
        return count;
    }
    public int SumArray(int arr[]){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args){
        CountFrequencyOFX cf = new CountFrequencyOFX();
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter size of array:");
        int n = scn.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter number to count: ");
        int target = scn.nextInt();

        int result = cf.CountF(arr, target);
        System.out.println("Count of "+ target+ " = "+ result);

        int sum = cf.SumArray(arr);
        System.out.println(sum);
        scn.close();
    }
}