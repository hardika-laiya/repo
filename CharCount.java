import java.util.*;
public class CharCount{
    public static void main(String[] args){
        String str = "java";
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println("Character count: "+ map);
    }
}