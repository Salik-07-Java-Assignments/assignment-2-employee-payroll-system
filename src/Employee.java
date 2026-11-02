public abstract class Employee {
    public static final String COMPANY_NAME = "XYZ Pvt. Ltd.";

    private final int id;
    private final String name;
    private final double baseSalary;

    protected Employee(int id, String name) {
        this(id, name, 0.0);
    }

    protected Employee(int id, String name, double baseSalary) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty");
        }

        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative");
        }

        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public abstract double calculateSalary();

    /**
     * Prints this employee's details. The call to {@link #calculateSalary()} below demonstrates
     * dynamic dispatch:
     *
     * <ol>
     *   <li><strong>Compile time:</strong> The compiler checks that {@code Employee} declares
     *       {@code calculateSalary()}. It does, so the call compiles.</li>
     *   <li><strong>Run time:</strong> The JVM looks at the actual object referenced by
     *       {@code this} and runs that class's version of the method.</li>
     * </ol>
     *
     * {@code calculateSalary()} is abstract in {@code Employee}, so it has no implementation
     * here. The call still works because the actual employee object's class provides the version
     * that runs. This is dynamic dispatch (also called runtime polymorphism or late binding).
     */
    public final void displayEmployeeDetails() {
        System.out.println("Company : " + COMPANY_NAME);
        System.out.println("Type    : " + getClass().getSimpleName());
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.printf("Salary  : %.2f%n", calculateSalary()); // Dynamic dispatch
    }
}
