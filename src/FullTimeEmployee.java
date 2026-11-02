public class FullTimeEmployee extends Employee {
    private final double bonus;

    public FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        if (bonus < 0) throw new IllegalArgumentException("Bonus cannot be negative");
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
