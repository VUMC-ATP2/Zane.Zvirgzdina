package classroom;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        // One line comment

        /*
        More than one line
        comments
         */

        //byte data type
        byte floorCount = 5;
        System.out.println("I live on " + floorCount +"th floor");
        System.out.printf("My house has %d floors\n", floorCount);


        // %d is for numbers
        // %s for text/string
        // %b for boolean

        short salaryInEuro = 1000;
        System.out.println(salaryInEuro);
        System.out.println(2500);

        System.out.printf("Average salary for Junior QA Engineer is: %d\n", salaryInEuro);

        int chinaPopulation = 1449687399;
        long currentWorldPopulation = 794609788;
        System.out.printf("Current world population: %d people. Meanwhile China population: %d people.\n", currentWorldPopulation, chinaPopulation);

        // floating numbers
        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEuro = 1.83445d;
        System.out.println(gasPriceInEuro);

        // Primitive text (char)
        char firstLetterOfMyName = 'Z';
        // for char variable use singe quotes and only one letter

        // Non-primitive String
        String myName = "Zane";
        System.out.println(myName);

        String mySentence = "Hello, my name is Zane. I do not want to tell my age.";
        String mySecondSentence = "I live in an apartment";
        System.out.println(mySentence);
        System.out.println(mySentence + " " + mySecondSentence);
        System.out.printf("%s %s\n", mySentence, mySecondSentence);

        double peopleLivingInMyHouse = 2.0d;
        System.out.println("Number of residents in my house is " + peopleLivingInMyHouse);

        // Boolean values
        // variable will also start with "is" or "has"
        // isSummer, hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if(isSummer) {
            System.out.println("Yes, it is summer!");
        } else {
            System.out.println("Nope, no summer yet..");

            // Arithmetic operators + - / *
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println(c);
            int x = b + 15;
            System.out.println(x);

            System.out.println(7 + 7); //14
            System.out.println("7" + 7); // equals 77
            System.out.println("7" + "7"); // equals 77

            boolean isAGreaterThanB = a > b; // 10 > 20 --> false
            boolean isASmallerThanB = a < b; // true

            boolean isTrue = a != b;
            System.out.println(isTrue);


        }
    }
}
