import java.util.*;

/**
 * Students
 */
class Students {
    String name;
    int age;
    Scanner sc = new Scanner(System.in);

    public void getInfor() {
        System.out.printf("Nhap ten: ");
        name = sc.next();
        System.out.printf("Nhap tuoi: ");
        age = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

/**
 * Innerlession
 */
class Innerlession {
    int x, y;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.println("Nhap chieu dai: ");
        x = sc.nextInt();
        System.out.println("Nhap chieu rong: ");
        y = sc.nextInt();
    }

    public int Area() {
        return x * y;
    }

    public int Perimeter() {
        return (x + y) / 2;
    }
}

/**
 * lession
 */
public class lession {

    public static void main(String[] args) {
        Students student1 = new Students();
        student1.getInfor();
        student1.display();
        Innerlession in = new Innerlession();
        in.getData();
        System.out.println(in.Area());
        System.out.println(in.Perimeter());

    }
}