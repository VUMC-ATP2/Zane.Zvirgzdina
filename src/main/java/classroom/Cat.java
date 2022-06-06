package classroom;

public class Cat {

    String name;
    String color;
    int age;
    boolean likesFriskies;
    boolean sleepsAtNight;

    public void catDetails(){
        System.out.println("Name of my cat is " + name + ". " +
                "\n She is " + color + " and " + age + " years old. " +
                "\n Does she like Friskies? That's a " + likesFriskies +
                ".\n But does she sleeps at night and doesn't wake me? That's " + sleepsAtNight);
    }

}
