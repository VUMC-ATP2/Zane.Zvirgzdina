package homeworkTwo;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HomeWorkTwo {
    public static void main(String[] args) {


        // Task 1
        int x = 8;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println((x > 5) && (x <= 10));
        System.out.println(!(x <= 5) && (x < 10));
        System.out.println((x == 0) || (x == 10));
        System.out.println(x * x > 10);

        // Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number (1-12)");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("1st month is January");
                break;
            case 2:
                System.out.println("2nd month is February");
                break;
            case 3:
                System.out.println("3rd month is March");
                break;
            case 4:
                System.out.println("4th month is April");
                break;
            case 5:
                System.out.println("5th month is May");
                break;
            case 6:
                System.out.println("6th month is June");
                break;
            case 7:
                System.out.println("7th month is July");
                break;
            case 8:
                System.out.println("8th month is August");
                break;
            case 9:
                System.out.println("9th month is September");
                break;
            case 10:
                System.out.println("10th month is October");
                break;
            case 11:
                System.out.println("11th month is November");
                break;
            case 12:
                System.out.println("12th month is December");
                break;
            default:
                System.out.println("Such number doesn't correspond to any month");
        }

        // Task 3
        System.out.println("Please write Number 1 (of 3):");
        int q = scanner.nextInt();
        System.out.println("Please write Number 2 (of 3):");
        int y = scanner.nextInt();
        System.out.println("Please write Number 3 (of 3):");
        int w = scanner.nextInt();
        if ((q > y) && (q > w)) {
            System.out.println(q + " (q) is the biggest number");
        } else if ((y > q) && (y > w)) {
            System.out.println(y + " is the biggest number");
        } else if ((w > q) && (w > y)) {
            System.out.println(w + " is the biggest number");
        } else {
            System.out.println("There are equal biggest numbers in the set, cannot determine the biggest one");
        }


        // Task 4
        System.out.println("TRAFFIC LIGHTS");
        System.out.println("Is the traffic light red, green or yellow?");
        String color = scanner.next();
        if (color.equals("green")) {
            System.out.println("Go across that street!");
        } else if (color.equals("red")) {
            System.out.println("Don't cross that street!");
        } else if (color.equals("yellow")) {
            System.out.println("Finish crossing street if already on it, otherwise wait for the green light");
        } else {
            System.out.println("Make sure there are no cars and then cross the street!");
        }

        // Task 5
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // Task 6
        printBusinessCardTwo("Jānis", "Bērziņš", 10203040, 1945);
        printBusinessCardTwo("Zaiga", "Saulīte", 22022022, 1987);
        printBusinessCardTwo("Vēsma", "Strautiņa", 29252222, 1958);

        // Task 7
        int summa = sum(8, 15);
        System.out.println(summa);

        // Task 8
        average(3.44, 4.55, 1.00);
    }

    public static void printBusinessCard() {
        System.out.println("Business Card" +
                "\n##########" +
                "\nName: Jānis" +
                "\nSurname: Krūmiņš" +
                "\nPhone Number: +371 27707707" +
                "\nYear of Birth: 1986" +
                "\n##########");
    }


    public static void printBusinessCardTwo(String name, String surname, int phoneNumber, int yearOfBirth) {
        System.out.println("Business Card" +
                "\n##########" +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nPhone Number: " + phoneNumber +
                "\nYear of Birth: " + yearOfBirth +
                "\n##########");
    }

    public static int sum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void average(double numberX, double numberY, double numberQ) {
        double avg = (numberX + numberY + numberQ) / 3;
        System.out.println(avg);
    }
}
