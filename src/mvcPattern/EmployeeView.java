package mvcPattern;

public class EmployeeView {
    public void printEmployeeDetails(String firstName, String lastName, byte age,
                                     String position, double salary) {
        System.out.println("Employee Details: ");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}
