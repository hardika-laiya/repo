import java.util.*;
public class MaxInArray{
    public static void main(String[] args){
        int arr[] = {10, 50, 30, 70, 20};
        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Max value: "+ max);
    }
}