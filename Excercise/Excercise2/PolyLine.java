package Excercise.Excercise2;

public class PolyLine {
    private Point[] points;

    public PolyLine(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }   

    public void setPoints(Point[] points) {
        this.points = points;
    }   

    public void add(Point v) {
        Point[] newPoints = new Point[points.length + 1];
        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }
        newPoints[points.length] = v;
        this.points = newPoints;
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].distance(points[i + 1]);
        }
        return length;
    }       
}
