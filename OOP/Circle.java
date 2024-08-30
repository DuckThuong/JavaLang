package OOP;

import java.util.*;

public class Circle {
    private double radius;
    private Math math = new Math();
    Scanner sc = new Scanner(System.in);

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void GetInformation() {
        System.out.println("Nhap ban kinh: ");
        radius = sc.nextDouble();
    }

    public double getArea() {
        return math.calculateCircleArea(radius);
    }

    public double getCircumference() {
        return math.calculateCircleCircumference(radius);
    }
}
