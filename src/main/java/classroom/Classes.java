package classroom;

public class Classes {
    public static void main(String[] args) {

        House myHouse = new House();
        // System.out.println(myHouse); //printing reference number

        System.out.println(myHouse.stories);
        myHouse.stories = 4;
        System.out.println(myHouse.stories);

        myHouse.printInformation();

        System.out.println("===============");

        House summerHouse = new House();
        summerHouse.propertyType = "summer house";
        summerHouse.stories = 1;
        summerHouse.marketValue = 567654d;
        summerHouse.printInformation();

        myHouse.isHouseOld();

        System.out.println("===============");
        // Car
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "330";
        bmw.yearOfMaking = 2008;
        bmw.engineSize = 3.30d;
        bmw.doorCount = 3;

        bmw.carInformation();

        Car audi = new Car();
        audi.fillPartCarData("Audi", "A6");
        System.out.println();

        Car opel = new Car("Opel", "Astra");
        // if using non-empty constructor, you can write in already pre-defined fields

        Car skoda = new Car();
        // chosen empty constructor, therefore will show the "print message"
        // If the empty constructor will be deleted in Car.java, there won't be an option to make Car() with empty ()


        System.out.println("===============");
        Cat myCat = new Cat();
        myCat.age = 8;
        myCat.color = "Black & White";
        myCat.likesFriskies = false;
        myCat.name = "Blueberry";
        myCat.sleepsAtNight = true;

        myCat.catDetails();

        System.out.println("===============");
        Fish yourFish = new Fish();
        yourFish.age = 0;
        yourFish.hasEatenToday = true;
        yourFish.color = "red";
        yourFish.name = "noname";
        yourFish.tankSize = 3.5d;

        yourFish.fishDetails();

        System.out.println("===============");
        Tree backyardTree = new Tree();
        backyardTree.dropsLeavesInWinter = true;
        backyardTree.estimatedAge = 3;
        backyardTree.height = 4;
        backyardTree.species = "unknown";
        backyardTree.width = 2;

    Circle round = new Circle();
        System.out.println(round.circleArea(50));
    }


}
