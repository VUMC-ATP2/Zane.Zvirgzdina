package classroom;

import java.sql.SQLOutput;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Before check");
        if (20 > 18) {
            System.out.println("Yes, 20 is bigger than 18");
        }

        System.out.println("After check");

        int age = 18;
        if (age >= 18){
            System.out.println("You can vote!");
        }
        System.out.println("You can go home!");


        int currentHours = 19;
        if (currentHours < 18){
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        int i = 20;
        if( i < 15) {
            System.out.println("i < 15");
        } else {
            System.out.println("i is greater than 15");
        }
        System.out.println("Outside if-else block");

        String vumc = "LU";
        if (vumc == "LU"){
            System.out.println("VUMC is the same as LU");
        } else {
            System.out.println("VUMC is not the same as LU");
        }

        int number = 2;
        if (number > 0){
            System.out.println("Number is greater than 0");
        } else if (number == 0){
            System.out.println("Number is equal to 0");
        } else {
            System.out.println("Number is less than 0");
        }

        // Switch
        String animal = "Mouse";

        switch (animal){
            case "Dog":
                System.out.println("You have a dog!");
            case "Cat":
                System.out.println("You have a cat!");
                break;
            default:
                System.out.println("I don't know the animal you have: " + animal);
        }

        int day = 7;
        switch (day){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's party Friday!");
                break;
            case 6:
                System.out.println("It's recovery Saturday");
                break;
            case 7:
                System.out.println("It's Sunday!");
            default:
                System.out.println("There is no day with such number");
        }


    }
}
