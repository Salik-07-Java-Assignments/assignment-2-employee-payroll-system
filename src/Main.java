public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(1, "Salik", 100_000, 20_000),
                new PartTimeEmployee(2, "Ali", 80, 500),
                new ContractEmployee(3, "Sara", 150_000, 15_000),
                new PartTimeEmployee(4, "Zero Hours", 0, 500)
        };

        double totalPayroll = 0;
        for (Employee e : employees) {
            e.displayEmployeeDetails();
            totalPayroll += e.calculateSalary();
            System.out.println("-------------------------");
        }
        System.out.printf("Total payroll: %.2f%n", totalPayroll);

        // Invalid-input
        try {
            new ContractEmployee(5, "Bad", 10_000, 20_000);
        } catch (IllegalArgumentException ex) {
            System.out.println("Rejected: " + ex.getMessage());
        }
    }
}