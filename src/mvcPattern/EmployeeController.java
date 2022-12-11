package mvcPattern;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeFirstName(String firstName) {
        model.setFirstName(firstName);
    }

    public String getEmployeeFirstName() {
        return model.getFirstName();
    }

    public void setEmployeeLastName(String lastName) {
        model.setLastName(lastName);
    }

    public String getEmployeeLastName() {
        return model.getLastName();
    }

    public void setEmployeeAge(byte age) {
        model.setAge(age);
    }

    public byte getEmployeeAge() {
        return model.getAge();
    }

    public void setEmployeePosition(String position) {
        model.setPosition(position);
    }

    public String getEmployeePosition() {
        return model.getPosition();
    }

    public void setEmployeeSalary(double salary) {
        model.setSalary(salary);
    }

    public double getEmployeeSalary() {
        return model.getSalary();
    }

    public void updateView() {
        view.printEmployeeDetails(model.getFirstName(), model.getLastName(),
                model.getAge(), model.getPosition(), model.getSalary());
    }
}
