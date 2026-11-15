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
    }
}
