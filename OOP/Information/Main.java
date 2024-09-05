package OOP.Information;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students[] students = new students[100];
        int n = 0;

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
                    while (true) {
                        if (n < students.length) {
                            students[n] = new students();
                            students[n].input();
                            n++;

                            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
                            String continueInput = sc.nextLine().trim().toLowerCase();
                            if (!continueInput.equals("y")) {
                                break;
                            }
                        } else {
                            System.out.println("Da dat toi da so luong sinh vien.");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Hien thi sinh vien");
                    if (n > 0) {
                        for (int i = 0; i < n; i++) {
                            System.out.println("\nThong tin sinh vien thu " + (i + 1) + ":");
                            students[i].display();
                        }
                    } else {
                        System.out.println("Chua co sinh vien nao duoc them.");
                    }
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
