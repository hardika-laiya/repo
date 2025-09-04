import java.util.*;
//Method Overriding Program
public class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }

}
class Dog extends Animal{
    @Overriding
    void sound(){
        System.out.println("Dog barks");
    }
}

public class OverridingExample{
    public static void main(String[] args){
        Animal obj = new Dog();
        obj.sound();
    }
}

