import java.util.*;
//Arrays, nested loops or HashSet
public class FindDuplicates{
    public static void main(String[] args) {
        
        int arr[] = {4, 2, 7, 4, 9, 2};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate element: "+ duplicates);
    }
}