package employee;

public class Main {
    public static void main() {
        //1.2.4
        Department it = new Department("IT");
        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);
        it.setManager(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
        //1.2.4

        //1.3.4
        System.out.println(petrov.getDepartment());
        //1.3.4

        //1.6.10
        Department sales = new Department("Продажи");
        Employee newManager = new Employee("Иванов", sales);
        it.setManager(newManager);
        System.out.println("После назначения начальника: " + it);
        newManager.setDepartment(sales);
        System.out.println("После перевода начальника: " + it);
        //1.6.10

        //3.2.1
        Department support = new Department("Поддержка");
        Employee supportManager = new Employee("Смирнов", sales);
        support.setManager(supportManager);
        System.out.println("После назначения: " + support);
        System.out.println("Прежний отдел: " + sales);
        supportManager.setDepartment(sales);
        System.out.println("После перевода: " + support);
        //3.2.1
    }
}
