import java.util.*;
public class Calculator1{
    //Overloading
    public double  Addition(int a, double b){
        return a+b;
    }
    public static void main(String[] srgs){
        int a = 10;
        double b = 2.50;
        double ans;
        Calculator1 cal = new Calculator1();
        ans = cal.Addition(a,b);
        System.out.println(ans);

        }
    }