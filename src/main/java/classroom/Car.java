package classroom;

public class Car {

    int doorCount;
    String brand;
    String model;
    double engineSize;
    int yearOfMaking;
    int tyres = 4;

    public void carInformation() {
        System.out.println("How many doors: " + doorCount);
        System.out.println("What kind of car it is? " + brand + model);
        System.out.println("Is it old? " + yearOfMaking);
        System.out.println("Is it powerful? " + engineSize + " liters of engine");
    }

    public void fillPartCarData(String carBrand, String carModel) {
        this.brand = carBrand;
        this.model = carModel;
        System.out.println("Information updated");
    }


    // Right mouse click / Generate / Constructor / Classroom.Car.java (upper file)

    // every time when Class will be made - this text will appear
    // because empty constructor
    public Car() {
        System.out.println("Car object is created!");
    }

    // Right mouse click / Generate / Constructor / choose fields


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
