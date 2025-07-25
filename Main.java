import java.util.*;

// Abstract class representing a Vehicle (hiding implementation details)
abstract class Vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();
    abstract void brake();

    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// Concrete implementation of a Car
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
        // Hidden complex logic: fuel injection, gear shifting, etc.
    }

    @Override
    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}

// Another vehicle type to demonstrate abstraction
class Bike extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Bike: Twisting throttle...");
        // Logic: air-fuel mixture, engine rev, etc.
    }

    @Override
    void brake() {
        System.out.println("Bike: Pulling brake lever...");
        // Logic: disc brakes, cable tension, etc.
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Using abstraction: treating Car and Bike as Vehicles
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        System.out.println("--- Car ---");
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();

        System.out.println("\n--- Bike ---");
        myBike.startEngine();
        myBike.accelerate();
        myBike.brake();
    }
}
