package ru.mirea.lab15;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee model = new Employee("Steve", 10.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.setEmployeeName("Steve");
        controller.setEmployeeHourlyRate(12.5);
        controller.setEmployeeHoursWorked(35);
        controller.updateView();
    }
}