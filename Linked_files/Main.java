package Linked_files;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("\n -----Studennt Management System-----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Roll No");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewAllStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting. ..");        
                default -> System.out.println("Invalid choice!");
        
            }
        
        }while (choice != 5);
    }
    static void addStudent(){

        System.out.println("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(rollNo, name, course));
        System.out.println("Student added!");

    }

    static void viewAllStudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
        }else{
            for(Student s : students){
                s.displayInfo();
            }
        }
    }
    

    static void searchStudent(){
        System.out.println("Enter Roll No to search: ");
        int rollNo = sc.nextInt();
        for(Student s : students){
            if(s.getRollNo() == rollNo){
                s.displayInfo();
                return;
            }
        }
        System.out.println("Student not found.");

    }
     
    static void deleteStudent(){
        System.out.println("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();
        students.removeIf(s -> s.getRollNo() == rollNo);
        System.out.println("Student remove if existed.");
    }
}   
