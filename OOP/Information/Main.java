package OOP.Information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        students[] students = new students[100];
        while (true) {
            System.out.println("\nChon chuc nang:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi sinh vien");
            System.out.println("3. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Them sinh vien");
                    System.out.println("Nhap so luong sinh vien: ");
                    n = sc.nextInt();
                    students[n] = new students();
                    students[n].input();
                    n++;
                    break;
                case 2:
                    System.out.println("Hien thi sinh vien");
                    students[n].display();
                    break;
                case 3:
                    System.out.println("Thoat");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
