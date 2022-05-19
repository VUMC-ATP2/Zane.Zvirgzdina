package homework;

import java.io.PrintStream;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "New Zealand";
        int countryPopulation = 5134000;
        int countrySizeInSqKm = 265685;
        String countryCapital = "Wellington";
        String countryOfficialLanguages = "English, Maori, New Zealand Sign Language";
        Boolean countryInEu = false;
        char countryCurrency = '$';

        System.out.println("One of countries I'd really like to visit is " + countryName + ". " +
                "\nApart from it being around the globe and making it exclusive, it has breathtaking nature. " +
                "\nThe country in my head is progressive and I think it's amazing that they have several official languages: " + countryOfficialLanguages +
                ". \nThe area of the island is fairly big (" + countrySizeInSqKm + "Sq Km) and there are " + countryPopulation + " people living there." +
                "\nDid you know the Capital of New Zealand? Because I didn't - it's " + countryCapital + "! Sounds so regular, right?");
        PrintStream printf = System.out.printf("When I will finally go to New Zealand, I will be sure to exchange Euros to their currency - New Zealand %c. \nWould you also like to visit NZ?\n", countryCurrency);

        int a = 300;
        int b = 3;
        byte c = -11;
        short d = 20501;
        double e = 3.0105;
        double f = 15.125;
        float g = 6;

        System.out.println(a+b);
        System.out.println(7+195);
        System.out.println(c+d+e+f+g);

        System.out.println(a-b);
        System.out.println(c-15);
        System.out.println(f-e-b);

        System.out.println(g*e);
        System.out.println(d*100);
        System.out.println(f*101-g);

        System.out.println(d/f);
        System.out.println(9562/g);
        System.out.println(f/b/c);

        System.out.println(d%b);
        System.out.println(f%e);
        System.out.println(a%b);
    }
}
