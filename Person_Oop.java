import java.util.*;

// abstract class Person{
//     abstract void name();
//     abstract void address();

//     void softwareEngineering(){
//         System.out.println("Person is came in the office.");
//     }
// }

// class Student extends Person{
//     @Override
//     void name(){
//         System.out.println("Name of the student is khyati");
//     }
//     @Override
//     void address(){
//         System.out.println("Student from Vastrapur");
//     }
// }

// class Employee extends Person{
//     @Override
//     void name(){
//         System.out.println("Jenny is doing a job of coding");
//     }
//     @Override
//     void address(){
//         System.out.println("she is living in Bhadaj.");
//     }
// }

// public class Person_Oop{
//     public static void main(String[] args){
//         Person stud = new Student();
//         Person emp = new Employee();

//         System.out.println("---- Studnets ----");
//         stud.softwareEngineering();
//         stud.name();
//         stud.address();

//         System.out.println(" ---- Employee ---- ");
//         emp.softwareEngineering();
//         emp.name();
//         emp.address();  
//     }
// }

abstract class Person{
    String name;
    String address;

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    abstract void displayInfo();

    void softwareEngineering(){
        System.out.println(name + "has come to office.");
    }
}
class Student extends Person{

    String course;
    String college;

    Student(String name, String address, String course, String college){
        super(name, address);
        this.course = course;
        this.college = college;
    }

    @Override
    void displayInfo(){
        System.out.println("Student name: "+ name);
        System.out.println("address: "+ address);
        System.out.println("course: "+ course);
        System.out.println("College: "+ college);
    }
}
class Employee extends Person{
    String designation;
    String company;

    Employee(String name, String address, String designation, String company){
        super(name, address);
        this.designation = designation;
        this.company = company;
    }
    @Override
    void displayInfo(){
        System.out.println("Employee name: "+name);
        System.out.println("address: "+ address);
        System.out.println( "Designation: "+ designation);
        System.out.println("Company: "+ company);
    }
}   

 public class Person_Oop{
   public static void main(String[] args){
        Person stud = new Student("Khyati", "Vastrapur"," BCA", "GLS College");
        Person emp = new Employee("Chanakya", "Bhadaj", "Software Developer", "TechCorp");

        System.out.println("-----Student-----");
        stud.softwareEngineering();
        stud.displayInfo();

        System.out.println("-----Employee-----");
        emp.softwareEngineering();
        emp.displayInfo();
    }
}