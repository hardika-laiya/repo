import java.util.*;
public class Student{
    int id;
    String n;

    //Added constructor to initialize both fields
    public Student(int id, String n){
        this.id = id;
        this.n = n;
    }
}
public class StudentExample{
    public static void main(String[] args) {
        //creating student object using the new constructor
        Student s1 = new Student(10, "Hardika");

        System.out.println(s1.id);
        System.out.println(s1.n);
        
    }
}