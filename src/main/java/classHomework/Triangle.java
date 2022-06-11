package classHomework;

public class Triangle {

    int sideA;
    int sideB;
    int sideC;
    int triangleArea;

    public void triangle() {
        System.out.println("We are making a triangle! Side lengths are: " + sideA + " & " + sideB + " & " + sideC);
    }

    public void areaOfTriangle(int a, int b, int c) {
        double perimeter = ((a + b + c) / 2); // this rounds up the result :(
        double areaOfTriangle = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        System.out.println("Area of the triangle is " + areaOfTriangle);
    }


    public boolean isTriangleEquilateral() {
        boolean iSEquilateral;
        if (sideA == 0 || sideB == 0 || sideC == 0) {
            System.out.println("This is not a triangle");
            iSEquilateral = false;
        } else if (sideA == sideB && sideA == sideC) {
            System.out.println("Triangle is equilateral (all sides ARE the same length)");
            iSEquilateral = true;
        } else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("This is not a triangle");
            iSEquilateral = false;
        } else {
            System.out.println("Triangle is not equilateral (all sides are NOT the same length)");
            iSEquilateral = false;
        }
        return iSEquilateral;
    }

    public boolean isTriangleIsosceles() {
        boolean isIsosceles;
        if (sideA == 0 || sideB == 0 || sideC == 0) {
            System.out.println("This is not a triangle");
            isIsosceles = false;
        } else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            System.out.println("This is not a triangle");
            isIsosceles = false;
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            System.out.println("Triangle is isosceles (two sides ARE the same length)");
            isIsosceles = true;
        } else {
            System.out.println("Triangle is not isosceles (two sides are NOT the same length)");
            isIsosceles = false;
        }
        return isIsosceles;
    }
}