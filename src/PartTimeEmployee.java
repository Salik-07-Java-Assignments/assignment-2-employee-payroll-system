public class PartTimeEmployee extends Employee {
    private final double hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(int id, String name, double hoursWorked, double hourlyRate) {
        super(id, name);
        if (hoursWorked < 0 || hourlyRate < 0) {
            throw new IllegalArgumentException("Hours and rate cannot be negative");
        }
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;     // double * double: no int overflow
    }
}