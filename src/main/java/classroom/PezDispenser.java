package classroom;

public class PezDispenser {

    String name;
    int capacity;
    int currentCandyCount;

    public PezDispenser(String name) {
        this.name = name;
        capacity = 20;
        currentCandyCount = 20;
    }

    public void eat() {
        if (currentCandyCount <= 0) {
            System.out.println("I can't eat, please load dispenser");
        } else {
            currentCandyCount--;
            System.out.println("I ate one pez!");
        }
    }

    public void eat(int candyCount){
        if (currentCandyCount <= 0){
            System.out.println("You can't eat, I'm empty!\n");
        } else if (currentCandyCount<candyCount){
            System.out.printf("You can't eat that much, there are only %d left\n", currentCandyCount);
        } else {
            currentCandyCount = currentCandyCount - candyCount;
            System.out.printf("I ate %d pezs. Pezs left %d\n", candyCount, currentCandyCount);
        }
    }

    public void load() {
        currentCandyCount = capacity;
        System.out.println("Dispenser is full again");
    }
}
