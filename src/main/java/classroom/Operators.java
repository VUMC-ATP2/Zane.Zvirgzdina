package classroom;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        // equal to ==
        int a = 10;
        int b = 5;
        System.out.println(a == b); // false

        // Not equal to
        int c = 5;
        int d = 4;
        System.out.println( c != d); // true

        // less than
        a = 30;
        b = 20;
        System.out.println(a<b); // false

        // Greater than
        c = 40;
        d = 50;
        System.out.println(c>d); // false

        boolean result = 40 < 20;
        System.out.println(result); // false

        // less than or equal to
        a = 100;
        b = 100;
        System.out.println(a <= b); // true

        // Greater than or equal to
        a = 200;
        b = 100;
        System.out.println(b >= a); // false

        // String comparison
        String name = "Zane";
        String name2 = "Zane";
        System.out.println(name == name2); // true

        // Logical operators
        int x = 10;
        result = x < 5 && x <10;
        // 10 < 5 (false)
        // 10 < 10 (false)
        System.out.println(result); // false

        result = 3 < 5 && 4 < 5; // AND
        System.out.println(result); // true

        System.out.println(3 < 5 || 4 > 5); // true

        a = 10;
        b = 20;
        result = !(a > b); //true
    }
}
