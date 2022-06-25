package polymorphism;

public class Vehicle {

    public void move(){
        System.out.println("You called move() method from: " + this.getClass().getName());
    }

    public void stop(){
        System.out.println("You called move() method from: " + this.getClass().getName());
    }
}
