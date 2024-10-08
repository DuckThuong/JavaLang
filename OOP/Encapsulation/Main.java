package OOP.Encapsulation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Students[] students = null;
        Person person = null;
        Day day = null;
        Time time = null;

        while (true) {
            System.out.println("\n1. Nhap sinh vien");
            System.out.println("2. Hien sinh vien");
            System.out.println("3. Tinh toan hinh tron");
            System.out.println("4. Su dung ham Math");
            System.out.println("5. Su dung ArrayCalculator");
            System.out.println("6. Nhap thong tin Person");
            System.out.println("7. Hien thi thong tin Person");
            System.out.println("8. Nhap va hien thi ngay");
            System.out.println("9. Nhap va hien thi thoi gian");
            System.out.println("10. Thoat");
            System.out.print("Chon chuc nang: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhap so luong sinh vien: ");
                    n = sc.nextInt();
                    students = new Students[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh vien " + (i + 1) + ":");
                        students[i] = new Students();
                        students[i].InnerStudents();
                    }
                    continue;
                case 2:
                    if (students != null && students.length > 0) {
                        System.out.println("Danh sach sinh vien:");
                        for (Students student : students) {
                            student.display();
                        }
                    } else {
                        System.out.println("Chua co sinh vien nao duoc nhap.");
                    }
                    continue;
                case 3:
                    while (true) {
                        circle.GetInformation();
                        System.out.println("Chon phep tinh:");
                        System.out.println("1. Tinh chu vi");
                        System.out.println("2. Tinh dien tich");
                        System.out.println("3. Quay lai menu chinh");
                        System.out.print("Lua chon cua ban: ");
                        int calcChoice = sc.nextInt();
                        switch (calcChoice) {
                            case 1:
                                System.out.println("Chu vi: " + circle.getCircumference());
                                break;
                            case 2:
                                System.out.println("Dien tich: " + circle.getArea());
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Lua chon khong hop le.");
                        }
                        if (calcChoice == 3) {
                            break;
                        }
                        System.out.println();
                    }
                    continue;
                case 4:
                    while (true) {
                        System.out.println("Chon phep toan:");
                        System.out.println("1. Tinh gia tri tuyet doi");
                        System.out.println("2. Tinh tong hai so");
                        System.out.println("3. Tinh hieu hai so");
                        System.out.println("4. Tim so nho nhat");
                        System.out.println("5. Tim so lon nhat");
                        System.out.println("6. Tinh luy thua");
                        System.out.println("7. Quay lai menu chinh");
                        System.out.print("Lua chon cua ban: ");
                        int mathChoice = sc.nextInt();

                        if (mathChoice == 7) {
                            break;
                        }

                        switch (mathChoice) {
                            case 1:
                                System.out.print("Nhap so: ");
                                int num = sc.nextInt();
                                System.out.println("Gia tri tuyet doi: " + Math.abs(num));
                                break;
                            case 2:
                                System.out.print("Nhap so thu nhat: ");
                                int a = sc.nextInt();
                                System.out.print("Nhap so thu hai: ");
                                int b = sc.nextInt();
                                System.out.println("Tong: " + Math.add(a, b));
                                break;
                            case 3:
                                System.out.print("Nhap so thu nhat: ");
                                a = sc.nextInt();
                                System.out.print("Nhap so thu hai: ");
                                b = sc.nextInt();
                                System.out.println("Hieu: " + Math.subStract(a, b));
                                break;
                            case 4:
                                System.out.print("Nhap so thu nhat: ");
                                a = sc.nextInt();
                                System.out.print("Nhap so thu hai: ");
                                b = sc.nextInt();
                                System.out.println("So nho nhat: " + Math.min(a, b));
                                break;
                            case 5:
                                System.out.print("Nhap so thu nhat: ");
                                a = sc.nextInt();
                                System.out.print("Nhap so thu hai: ");
                                b = sc.nextInt();
                                System.out.println("So lon nhat: " + Math.max(a, b));
                                break;
                            case 6:
                                System.out.print("Nhap co so: ");
                                double base = sc.nextDouble();
                                System.out.print("Nhap so mu: ");
                                double exponent = sc.nextDouble();
                                System.out.println("Ket qua: " + Math.pow(base, exponent));
                                break;
                            default:
                                System.out.println("Lua chon khong hop le.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhap so luong phan tu trong mang:");
                    int size = sc.nextInt();
                    int[] arr = new int[size];
                    System.out.println("Nhap cac phan tu cua mang:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                    }

                    while (true) {
                        System.out.println("Chon phep toan cho mang:");
                        System.out.println("1. Tinh tong");
                        System.out.println("2. Tinh trung binh");
                        System.out.println("3. Tim gia tri lon nhat");
                        System.out.println("4. Tim gia tri nho nhat");
                        System.out.println("5. Dao nguoc mang");
                        System.out.println("6. Quay lai menu chinh");
                        System.out.print("Lua chon cua ban: ");
                        int arrayChoice = sc.nextInt();

                        if (arrayChoice == 6) {
                            break;
                        }

                        switch (arrayChoice) {
                            case 1:
                                System.out.println("Tong: " + ArrayCalculator.sum(arr));
                                break;
                            case 2:
                                System.out.println("Trung binh: " + ArrayCalculator.average(arr));
                                break;
                            case 3:
                                System.out.println("Gia tri lon nhat: " + ArrayCalculator.max(arr));
                                break;
                            case 4:
                                System.out.println("Gia tri nho nhat: " + ArrayCalculator.min(arr));
                                break;
                            case 5:
                                System.out.println("Mang dao nguoc: " + Arrays.toString(ArrayCalculator.reverse(arr)));
                                break;
                            default:
                                System.out.println("Lua chon khong hop le.");
                        }
                    }
                    break;
                case 6:
                    person = new Person();
                    System.out.print("Nhap ten: ");
                    sc.nextLine();
                    person.setName(sc.nextLine());
                    System.out.print("Nhap tuoi: ");
                    person.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nhap dia chi: ");
                    person.setAddress(sc.nextLine());
                    System.out.println("Da nhap thong tin Person thanh cong.");
                    break;
                case 7:
                    if (person != null) {
                        System.out.println("Thong tin Person:");
                        person.display();
                    } else {
                        System.out.println("Chua co thong tin Person. Vui long nhap thong tin truoc.");
                    }
                    break;
                case 8:
                    day = new Day();
                    System.out.print("Nhap ngay: ");
                    day.setDay(sc.nextInt());
                    System.out.print("Nhap thang: ");
                    day.setMonth(sc.nextInt());
                    System.out.print("Nhap nam: ");
                    day.setYear(sc.nextInt());
                    System.out.println("Ngay da nhap:");
                    day.display();
                    break;
                case 9:
                    time = new Time();
                    System.out.print("Nhap gio: ");
                    int hour = sc.nextInt();
                    System.out.print("Nhap phut: ");
                    int minute = sc.nextInt();
                    System.out.print("Nhap giay: ");
                    int second = sc.nextInt();
                    time.setTime(hour, minute, second);
                    
                    System.out.println("Thoi gian hien tai:");
                    time.display();
                    
                    while (true) {
                        System.out.println("\nChon thao tac:");
                        System.out.println("1. Tang 1 giay");
                        System.out.println("2. Giam 1 giay");
                        System.out.println("3. Tang 1 phut");
                        System.out.println("4. Giam 1 phut");
                        System.out.println("5. Tang 1 gio");
                        System.out.println("6. Giam 1 gio");
                        System.out.println("7. Quay lai menu chinh");
                        System.out.print("Lua chon cua ban: ");
                        int timeChoice = sc.nextInt();
                        
                        switch (timeChoice) {
                            case 1:
                                time.nextSecond();
                                break;
                            case 2:
                                time.previousSecond();
                                break;
                            case 3:
                                time.nextMinute();
                                break;
                            case 4:
                                time.previousMinute();
                                break;
                            case 5:
                                time.nextHour();
                                break;
                            case 6:
                                time.previousHour();
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Lua chon khong hop le.");
                        }
                        
                        if (timeChoice == 7) {
                            break;
                        }
                        
                        System.out.println("Thoi gian sau thao tac:");
                        time.display();
                    }
                    break;
                case 10:
                    System.out.println("Tam biet!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
