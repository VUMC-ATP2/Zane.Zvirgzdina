package classroom;

public class Fish {

    String color;
    String name;
    int age;
    boolean hasEatenToday;
    double tankSize;

    public void fishDetails(){
        System.out.println("Color of the fish: " + color);
        System.out.println("Name of the fish: " +  name);
        System.out.println("Age of the fish: " + age);
        System.out.println("Has it eaten today: " + hasEatenToday);
        System.out.println("It lives in " + tankSize + " liter tank");
    }

}
