package Excercise.Excercise;

public class PartimeEm extends Employee {
    private int workingHours;

    public PartimeEm(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary() {
        return paymentPerHour * workingHours;
    }   
}
