// Vehicle.java
public interface Vehicle {
    void accelerate();
    void brake();
}

// Car.java
public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " mph...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " mph for " + duration + " seconds...");
    }
}

// Bicycle.java
public class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is accelerating...");
    }

    @Override
public void brake() {
        System.out.println("Bicycle is braking...");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " mph...");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " mph for " + duration + " seconds...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.accelerate();
        car.brake();
        car.accelerate(50);
        car.accelerate(50, 10);

        System.out.println();

        bicycle.accelerate();
        bicycle.brake();
        bicycle.accelerate(10);
        bicycle.accelerate(10, 5);
    }
}