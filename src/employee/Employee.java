package employee;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        setDepartment(department);
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
        if (this.department == department) {
            return;
        }
        if (this.department != null) {
            this.department.employees.remove(this);
            if (this.department.manager == this) {
                this.department.manager = null;
            }
        }
        this.department = department;
        if (department != null) {
            department.employees.add(this);
        }
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
