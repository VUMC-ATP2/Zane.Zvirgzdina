package classroom;

public class Dog extends Animal {
    boolean canProtectHouse = true;


    // right click / Generate / Overwrite / Voice()
    @Override
    void voice() {
        System.out.println("Wuf Wuf!");
    }
}
