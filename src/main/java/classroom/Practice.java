package classroom;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please write a number:");
//        int inputResult = scanner.nextInt();
//        if (inputResult>0){
//            System.out.println("Number is > 0 which is: " + inputResult);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please insert your age");
//        int inputAge = scanner.nextInt();
//        if (inputAge >= 18){
//            System.out.println("You can proceed to vote!");
//        } else {
//            System.out.println("Sorry, you can't vote");
//        }
//        System.out.println("Thank you for coming!");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What number of day it is?");
//        int numberOfDay = scanner.nextInt();
//        switch (numberOfDay){
//            case 1:
//                System.out.println("It's Monday");
//                break;
//            case 2:
//                System.out.println("It's Tuesday");
//                break;
//            case 3:
//                System.out.println("It's Wednesday");
//                break;
//            case 4:
//                System.out.println("It's Thursday");
//                break;
//            case 5:
//                System.out.println("It's party Friday!");
//                break;
//            case 6:
//                System.out.println("It's recovery Saturday");
//                break;
//            case 7:
//                System.out.println("It's Sunday!");
//                break;
//            default:
//                System.out.println("There is no day with such number");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input any number");
//        int numberInput = scanner.nextInt();
//        boolean result = numberInput % 2 == 0;
//        if (result) {
//            System.out.println("You typed in even number");
//        } else {
//            System.out.println("You typed in odd number");
//        }

checkAge(17);

    }

    public static void checkAge(int age){
        if (age < 0){
            System.out.println("Have you been born?");
        } else if (age >= 14 && age <= 16) {
            System.out.println("Hang in there, buddy");
        } else if (age == 17) {
            System.out.println("soon, buddy, soon");
                    } else if (age >= 18) {
            System.out.println("Ready to party?");
        }


    }
}
