package Excercise.Excercise2;

import java.lang.Math;

public class Triangle {
    private Point v1;
    private Point v2;
    private Point v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Triangle(float x1, float y1, float x2, float y2, float x3, float y3) {
        this.v1 = new Point(x1, y1);
        this.v2 = new Point(x2, y2);
        this.v3 = new Point(x3, y3);
    }

    public Point getV1() {
        return v1;
    }

    public Point getV2() {
        return v2;
    }

    public Point getV3() {
        return v3;
    }

    public void setV1(Point v1) {
        this.v1 = v1;
    }

    public void setV2(Point v2) {
        this.v2 = v2;
    }

    public void setV3(Point v3) {
        this.v3 = v3;
    }

    public void add(Point v) {
        this.v3 = v;
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
}
