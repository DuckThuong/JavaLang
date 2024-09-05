package Excercise.Excercise;

public class FulltimeEm extends Employee {

    public FulltimeEm(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return paymentPerHour * 8;
    }

}
