package classroom;

import java.sql.SQLOutput;
import java.util.Arrays;

public class LoopsPractice {
    public static void main(String[] args) {
        // print 0-4;

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // same as i = i+1
        }

        i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--; // same as i = i-1
        }

        // print array values using "while"
        int[] arr = {2, 11, 45, 9};
        i = 0;
        while (i < 4) {
            System.out.println(arr[i]);
            i++;
        }

        System.out.println("even numbers:");

        // Print out even numbers from 0 to 10;
        // i % 2 == 0;
        int x = 0;
        while (x <= 10) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }

        // 18 - 25
        int age = 18;
        do {
            System.out.println(age);
            age++;
        } while (age <= 25);

        // print out even numbers from 0 to 10, use do while

        System.out.println("Do while start");
        int number = 0;
        do {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 10);

        System.out.println("FOR start");
        for (int y = 0; y <= 10; y++) {
            System.out.print(y + ", ");
        }
        System.out.println("");

        // Print in one line numbers from 20 to 0 using FOR
        for (int j = 20; j >= 0; j--) {
            if (j % 2 == 0) {
                System.out.print(j + ", ");
            }
        }
        System.out.println();
        System.out.println();

        // by using FOR, print all countries from String array
        System.out.println("FOR again");
        String[] countries = new String[]{"Latvia", "Canada", "USA", "Estonia", "Mexico", "Lithuania"};
        for (int j = 0; j < countries.length; j++) {
            System.out.print(countries[j] + ", ");
        }

        System.out.println();
        for (int j = countries.length - 1; j >= 0; j--) {
            System.out.print(countries[j] + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("FOR EACH");
        // for each
        for (String country : countries) {
            System.out.println(country);
        }

        // create int array with numbers from 0 to 100;
        // print numbers that are => than 50;
        int[] array = new int[101];
        for (int m = 0; m < array.length; m++) {
            array[m] = m;
        }

        for (int b = 0; b < array.length; b++) {
            if (array[b] >= 50) {
                System.out.println(array[b]);
            }
        }
        System.out.println("$$$$$$");
        // for countries array check if there is USA in it and make a break
        for (int j = 0; j < countries.length; j++) {
            if (countries[j].equals("USA")) {
                System.out.println("I found USA");
                break;
            }
        }

        // for loop 1-10;
        // If value of i is between 4 and 9, don't print
        // continue
        System.out.println("CONTINUE piemērs");
        for (int j = 0; j < 10; j++) {
            if (j > 4 && j < 9) {
                continue;
            }
            System.out.println(j);
        }
    }
}
