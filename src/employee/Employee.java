package employee;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        String employeeName = name == null ? "Сотрудник" : name;
        if (department == null) {
            return employeeName + " не состоит в отделе";
        }

        String departmentName = department.getName();
        if (departmentName == null || departmentName.isBlank()) {
            departmentName = "без названия";
        }

        if (department.getManager() == this) {
            return employeeName + " начальник отдела " + departmentName;
        }
        if (department.getManager() == null) {
            return employeeName + " работает в отделе " + departmentName + ", начальник не указан";
        }

        String managerName = department.getManager().getName();
        if (managerName == null || managerName.isBlank()) {
            managerName = "не указан";
        }
        return employeeName + " работает в отделе " + departmentName
                + ", начальник которого " + managerName;
    }
}
