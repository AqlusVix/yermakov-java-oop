package employee;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    Employee manager;
    final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        if (manager != null) {
            manager.setDepartment(this);
        }
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return List.copyOf(employees);
    }

    @Override
    public String toString() {
        String departmentName = name == null || name.isBlank() ? "без названия" : name;
        String managerName = "не указан";
        if (manager != null && manager.getName() != null && !manager.getName().isBlank()) {
            managerName = manager.getName();
        }
        List<String> employeeNames = new ArrayList<>();
        for (Employee employee : employees) {
            employeeNames.add(employee.getName());
        }
        return "Отдел " + departmentName + ", начальник: " + managerName
                + ", сотрудники: " + employeeNames;
    }
}
