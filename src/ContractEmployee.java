public class ContractEmployee extends Employee {
    private final double contractAmount;
    private final double tax;                // absolute amount, not a percentage

    public ContractEmployee(int id, String name, double contractAmount, double tax) {
        super(id, name);
        if (contractAmount < 0 || tax < 0) {
            throw new IllegalArgumentException("Amounts cannot be negative");
        }
        if (tax > contractAmount) {
            throw new IllegalArgumentException("Tax cannot exceed contract amount");
        }
        this.contractAmount = contractAmount;
        this.tax = tax;
    }

    @Override
    public double calculateSalary() {
        return contractAmount - tax;
    }
}