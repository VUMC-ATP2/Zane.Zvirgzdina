package classHomework;

public class Main {
    public static void main(String[] args) {

        Triangle myTriangle = new Triangle();
        myTriangle.sideA = 30;
        myTriangle.sideB = 30;
        myTriangle.sideC = 30;

        myTriangle.triangle();

        myTriangle.areaOfTriangle(myTriangle.sideA, myTriangle.sideB, myTriangle.sideC);

        myTriangle.isTriangleEquilateral();

        myTriangle.isTriangleIsosceles();

    }

}
