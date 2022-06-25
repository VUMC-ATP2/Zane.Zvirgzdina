package classroom;

public class Circle {
    double PI = 3.14;
    double circleArea;

    // PI * R ^ 2

    public double circleArea(double radius){
        circleArea = PI * (radius * radius);
        return circleArea;

        // Alternatīvi var nedefinēt sākotnējo radius un izmantot
        // return PI* (radius * radius)
    }
}


