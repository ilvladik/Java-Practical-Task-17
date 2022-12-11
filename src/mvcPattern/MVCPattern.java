package mvcPattern;

public class MVCPattern {
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        controller.setEmployeeSalary(180_000);
        System.out.println("Updating...");
        controller.updateView();
    }

    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee();
        employee.setFirstName("Виктор");
        employee.setLastName("Кузнецов");
        employee.setAge((byte) 27);
        employee.setPosition("Системный администратор");
        employee.setSalary(157_000);
        return employee;
    }
}
