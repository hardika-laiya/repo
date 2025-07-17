import java.util.*;
/*
Build Basic calculator or using java console I/O
Create methods for addition, substraction, multiplication, division.
Use a loop to allow multiple calculations until the user exits.
OUTCOME:  Understand java syntax and logic.
*/

public class Calculator{
    public static double addition(double a, double b){
        return a + b;
    }
    public static double sub(double a, double b){
        return a - b;
    }    
    public static double multiple(double a, double b){
        return a * b;
    }
    public static double division(double a, double b){
        if(b == 0){
            System.err.println("Error: Division by Zero!");
            return Double.NaN;
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         boolean running = true;

        while ( running) {
            System.out.println("\n Choose an operation");
            System.out.println("1) Addition");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) EXIT");
            System.out.println("Enter Choice (1-5): ");
            
            if(!sc.hasNextInt()){
                System.err.println("Invalid input! Expected a number. Exiting...");
                break;
            }

            int choice = sc.nextInt();
            if(choice == 5  ||  choice <= 0 || choice > 5){
                running = false;
                System.out.println("Good Bye!");
                break;
            }

            System.out.print("Enter a First number: ");
            if(!sc.hasNextDouble()){
                System.err.println("Invalid number!  Exiting.. ");
                break;
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter a second number: ");
            if(!sc.hasNextDouble()){
                System.err.println("Invalid number!  Exiting.. ");
                break;
            }
            double num2 = sc.nextDouble();

           double result;
            switch (choice) {
                case 1:
                    result = addition(num1, num2);
                    System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                    break;

                case 2:
                    result = sub(num1, num2);
                    System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case 3:
                    result = multiple(num1, num2);
                    System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case 4:
                    result = division(num1, num2);
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                    break;
            
                default:
                System.err.print("Invalid choice!.Please Select 1-5.");
            }
        }
        sc.close();
    }
}