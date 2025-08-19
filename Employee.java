import java.util.*;
public class Employee{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.setName("Hardika");
        emp.setAge(25);

        System.out.println("Name: "+ emp.getName());
        System.out.println("Age: "+ emp.getAge());
    }

}