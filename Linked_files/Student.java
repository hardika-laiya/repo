package Linked_files;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class Student{
    private int rollNo;
    private String name;
    private String course;

    public Student(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public int getRollNo(){
        return rollNo;
    }

     public String getName(){
        return name;
     }

     public String getCourse(){
        return course;
     }

    public void displayInfo(){
        System.out.println("RollNo: "+rollNo + "Name: "+ name+ "Course: "+ course );
        
    }
}