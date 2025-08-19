import java.util.*;
public class Arithmetic_Fun{

    public int Sum(int a, int b){
        return a+b;
    }
    public int Multi(int a, int b){
        int ans  = Sum(a,b);
        int mul = ans * 5;
        return mul;

    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        Arithmetic_Fun obj = new Arithmetic_Fun();
        int ans = obj.Multi(a, b);
        System.out.println(ans);

    }
}