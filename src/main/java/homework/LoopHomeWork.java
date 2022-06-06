package homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        // Task 1: take in numbers, when the sum reaches 100, print "ready". Use WHILE
        Scanner scanner = new Scanner(System.in);
        int sumOfNum = 0;
        int i;
        while (sumOfNum < 100){
            System.out.println("Please enter number: ");
            i = scanner.nextInt();
            sumOfNum = sumOfNum + i;
        }
        System.out.println("Ready");


        // Task 2: Prime number printout (y/n);
        int n = 13;
        boolean prime = false;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number.");
        } else if (n == 2) {
            System.out.println(n + " is a prime number");
        } else {
            for (int a = 2; a <= n / 2; a++) {
                if (n % a == 0) {
                    prime = true;
                    break;
                }
            }
            if (!prime) System.out.println(n + " is a prime number.");
            else System.out.println(n + " is not a prime number.");
        }


        // Task 3: Define 3 types of arrays (with int, String and char). Print using WHILE, DO WHILE, FOR LOOP, FOR EACH.
        int[] arrayOfInt = {3, 17, 21, 5, 89, 150};
        String[] arrayOfStrings = {"blue sky", "bright sun", "no clouds", "green grass", "light breeze"};
        char[] arrayOfChars = {'S', 'U', 'M', 'M', 'E', 'R'};

        int b = 0;
        while (b < 3) {
            System.out.print(arrayOfInt[b] + ", ");
            b++;
        }

        System.out.println(" ");
        int c = 0;
        do {
            System.out.print(arrayOfChars[c] + ", ");
            c++;
        } while (c < 4);

        System.out.println(" ");
        for (int o = 0; o < arrayOfStrings.length; o++) {
            System.out.println("Indicator of lovely summer day: " + arrayOfStrings[o]);
        }

        System.out.println(" ");
        System.out.println("Indicators of perfect summer day:");
        for (String g : arrayOfStrings) {
            System.out.print(g + ", ");
        }

        System.out.println(" ");
        System.out.println(" ");
        // Task 4: Define array with 100 slots, fill with even numbers. Print array in one line
        int m;
        int[] array = new int[100];
        for (i = 0; i < array.length; i++) {
            for (m = 0; m < 200; m++) {
                if (m % 2 == 0) {
                    array[i] = m;
                    System.out.print(array[i] + ", ");
                }
            }
            break;
        }


        // Task 5: Write a function that calculates factorial of a given number
        System.out.println(" ");
        System.out.println("FACTORIAL");
        int k = 3;
        int stage = 1;
        for (int j = 1; j <= k; j++) {
            stage = stage*j;
        }
        System.out.println("Factorial of " + k + " is " + stage);


        // Task 6: Write a program that allows three inputs by user of PIN. If it's correct - print "PIN accepted, welcome back"
        // If the PIN is wrong - print "Wrong PIN, try again", if the guesses are finished print "Sorry, you have been blocked"
        System.out.println("PIN input");
        int tries = 1;
        int pin = 1234;
        System.out.println("Please enter PIN number: ");
        int inputPin = scanner.nextInt();
        while (inputPin != pin && tries <3) {
            System.out.println("Wrong PIN, try again");
            System.out.println("Please enter PIN number: ");
            inputPin = scanner.nextInt();
            tries++;
                   }
        if (inputPin != pin && tries ==3){
            System.out.println("Sorry, you have been blocked");
        } else {
            System.out.println("PIN accepted, welcome back");
        }
    }
}
