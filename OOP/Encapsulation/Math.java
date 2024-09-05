
package OOP.Encapsulation;

public class Math {
    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subStract(int x, int y) {
        return x - y;
    }

    public static int min(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static double pow(double x, double y) {
        return java.lang.Math.pow(x, y);
    }

    public static double calculateCircleArea(double radius) {
        return java.lang.Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * java.lang.Math.PI * radius;
    }

    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

}
