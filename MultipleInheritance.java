// Interface for vehicles that can move
interface Movable {
    void move();
}

// Interface for vehicles that can honk
interface Honkable {
    void honk();
}

// Car class implementing both Movable and Honkable interfaces
class Car implements Movable, Honkable {
    public void move() {
        System.out.println("Car is moving.");
    }

    public void honk() {
        System.out.println("Car is honking.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.move(); // Output: Car is moving.
        myCar.honk(); // Output: Car is honking.
    }
}