package OOP.Polymorphism;

public class main {
    public static void main(String[] args) {
        // Đa hình với nạp chồng phương thức
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1.0, 2.0));
        System.out.println(calculator.add(1, 2, 3));
        // Đa hình với ghi đè phương thức
        Employee employee = new Employee("John", 1000);
        employee.display();

        Manager manager = new Manager("Jane", 2000, 1000);
        manager.display();

        // Đa hình với đa hình
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
