/*
Employee.java
All information and methods involving Employees
Sudhanya Golla
Created July 16th, 2024
Last Modified July 16th, 2024
*/

// Java setup
public class Employee {
    
    // Set all properties within class Employee
    private String name;
    private int id;
    private double salary;
    private String department;

    // Set up constructor to initialize all values
    // Assign values to each property
    public Employee(String name, int id, double salary, String department)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    // Determine and output employee's salary after a raise
    public void raiseSalary(double percentage)
    {
        this.salary = this.salary * (1+(percentage));
        System.out.println(this.name + "'s new salary is $" + this.salary);
    }

    // Determine and output employee's tax given a specified tax
    public void determineTax(double taxRate)
    {
        double tax = this.salary * taxRate;
        System.out.println("Employee " + this.name + "'s tax is $" + tax);

    }

    // Determine and output which employee's salary is higher
    public void compareSalary(Employee e)
    {
        if (this.salary > e.salary)
        {
            System.out.println(this.name + " makes more than " + e.name);
        }
        else if (e.salary > this.salary)
        {
            System.out.println(e.name + " makes more than " + this.name);
        }
        else
        {
            System.out.println("They both make the same amount of money.");
        }
    }

    // Reset and output employee's new department
    public void setDepartment(String newDepartment)
    {
        this.department = newDepartment;
        System.out.println("Employee's new department is " + this.department);
    }

    // Print all information about employee
    public void printInfo()
    {
        System.out.println("Employee's name is " + this.name + ", their ID is " + this.id + ", their salary is $" + this.salary + ", and their department's name is " + this.department);
    }
}
