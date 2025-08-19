import java.util.*;
public class SecondLargest{
    public static void main(String[] args){
        int arr[] = {10,30,50,20,40};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > first){
                second = first;
                first = num;
            }else if(num> second && num != first){
                second = num;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No second largest element (all elements are same)");
        }else{
            System.out.println("Second largest element is: "+ second);
        }

    }
}