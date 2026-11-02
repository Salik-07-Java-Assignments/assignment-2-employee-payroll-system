# Assignment #2: Employee Payroll System

A small Java console application for an employee payroll coursework assignment. It demonstrates abstract classes, inheritance, method overriding, input validation, and runtime polymorphism.

## Requirements

- Java Development Kit (JDK) 11 or newer

## Build and run

From the project root, compile the source files into an `out` directory and run the `Main` class:

```powershell
New-Item -ItemType Directory -Force out
javac -d out src\*.java
java -cp out Main
```

## Employee types

All employee types extend the abstract `Employee` class and provide their own `calculateSalary()` implementation:

| Type | Salary calculation |
| --- | --- |
| `FullTimeEmployee` | Base salary + bonus |
| `PartTimeEmployee` | Hours worked × hourly rate |
| `ContractEmployee` | Contract amount − tax |

The constructors reject blank employee names and negative pay inputs. Contract tax also cannot exceed the contract amount. `Main` prints each employee's details and salary, totals the payroll, and demonstrates rejection of invalid contract data.

## Project layout

```text
src/
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── ContractEmployee.java
└── Main.java
```
