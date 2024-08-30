package OOP;

import java.util.*;

public class Studens {
    private String name;
    private int age;
    private String render;
    private double gpa;
    Scanner sc = new Scanner(System.in);

    public Studens() {

    }

    public Studens(String name, int age, String render, double gpa) {
        this.name = name;
        this.age = age;
        this.render = render;
        this.gpa = gpa;
    }

    public void InnerStudens() {
        System.out.println("Nhap ten: ");
        name = sc.next();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap gioi tinh: ");
        render = sc.next();
        System.out.println("Nhap GPA: ");
        gpa = sc.nextDouble();
    }

    public void display() {
        System.out.println("Ho va ten: " + name + " , Tuoi: " + age);
        System.out.println("Gioi Tinh: " + render + " , GPA: " + gpa);
        System.out.println();
    }
}
