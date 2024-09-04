package OOP.Information;

import java.util.Scanner;

public class students extends person {
    private String studentID;
    private String classID;
    private String faculty;
    private String university;
    private String major;
    private String degree;
    private String status;
    Scanner sc = new Scanner(System.in);

    public students(String name, String address, String phoneNumber, String email, String gender, String dateOfBirth,
            String placeOfBirth, String nationality, String studentID, String classID, String faculty,
            String university,
            String major, String degree, String status) {
        super(name, address, phoneNumber, email, gender, dateOfBirth, placeOfBirth, nationality);
        this.studentID = studentID;
        this.classID = classID;
        this.faculty = faculty;
        this.university = university;
        this.major = major;
        this.degree = degree;
        this.status = status;
    }

    public students() {
        super();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void input() {
        System.out.println("Nhap thong tin sinh vien: ");
        System.out.println("Nhap ten: ");
        setName(sc.nextLine());
        System.out.println("Nhap dia chi: ");
        setAddress(sc.nextLine());
        System.out.println("Nhap so dien thoai: ");
        setPhoneNumber(sc.nextLine());
        System.out.println("Nhap email: ");
        setEmail(sc.nextLine());
        System.out.println("Nhap gioi tinh: ");
        setGender(sc.nextLine());
        System.out.println("Nhap ngay sinh: ");
        setDateOfBirth(sc.nextLine());
        System.out.println("Nhap noi sinh: ");
        setPlaceOfBirth(sc.nextLine());
        System.out.println("Nhap quoc tich: ");
        setNationality(sc.nextLine());
        System.out.println("Nhap ma sinh vien: ");
        setStudentID(sc.nextLine());
        System.out.println("Nhap lop: ");
        setClassID(sc.nextLine());
        System.out.println("Nhap khoa: ");
        setFaculty(sc.nextLine());
        System.out.println("Nhap truong dai hoc: ");
        setUniversity(sc.nextLine());
        System.out.println("Nhap chuyen nganh: ");
        setMajor(sc.nextLine());
        System.out.println("Nhap bac dao tao: ");
        setDegree(sc.nextLine());
        System.out.println("Nhap trang thai: ");
        setStatus(sc.nextLine());
    }

    public void display() {
        super.display();
        System.out.println("Student ID: " + studentID);
        System.out.println("Class ID: " + classID);
        System.out.println("Faculty: " + faculty);
        System.out.println("University: " + university);
        System.out.println("Major: " + major);
    }
}
