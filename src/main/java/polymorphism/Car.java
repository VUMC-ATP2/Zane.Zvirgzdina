package polymorphism;

public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("You called move() method from: " + this.getClass().getName());
        System.out.println("Vrum-vrum!");
    }

    @Override
    public void stop() {
        System.out.println("You called move() method from: " + this.getClass().getName());
        System.out.println("Stoooop!");
    }
}
