package Lab4;

public class Employee implements Rules {
    public double salary;
    public String name;

    /**
     * Constructor
     * @param newName Name
     * @param newSalary Salary
     */
    public Employee(String newName, double newSalary) {
        salary = newSalary;
        name = newName;
    }

    /**
     * Default Constructor
     */
    public Employee() {
        salary = 0.00;
        name = "Default Employee";
    }

    /**
     * Returns salary--formatted
     * @return Salary
     */
    public String getSalary() {
        String prompt = String.format("$%.2f", salary);
        return prompt;
    }

    /**
     * Returns name
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns information on Employee
     * @return
     */
    public String toString() {
        String prompt = String.format("Name: " + name + "\nSalary: $%.2f", salary);
        return prompt;
    }
}
