package classHomework;

public class Main {
    public static void main(String[] args) {

        Triangle myTriangle = new Triangle();
        myTriangle.sideA = 13;
        myTriangle.sideB = 13;
        myTriangle.sideC = 10;

        myTriangle.triangle();

        myTriangle.triangleArea(myTriangle.sideA, myTriangle.sideB, myTriangle.sideC);

        myTriangle.isTriangleEquilateral();

        myTriangle.isTriangleIsosceles();

    }

}
