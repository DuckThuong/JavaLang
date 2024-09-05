package Excercise.Excercise2;

public class Main {
    public static void main(String[] args) {
        Point begin = new Point(0, 0);
        Point end = new Point(3, 4);
        Line line = new Line(begin, end);
        System.out.println("Length: " + line.getLength());
        Point v1 = new Point(0, 0);
        Point v2 = new Point(3, 0);
        Point v3 = new Point(0, 4);
        Triangle triangle = new Triangle(v1, v2, v3);
        System.out.println("Perimeter: " + triangle.getPerimeter());
        Point[] points = {new Point(0, 0), new Point(3, 0), new Point(0, 4)};
        PolyLine polyLine = new PolyLine(points);
        System.out.println("Length: " + polyLine.getLength());  
        polyLine.add(new Point(1, 1));
        System.out.println("Length: " + polyLine.getLength());  
    }
}
