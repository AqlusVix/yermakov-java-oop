package student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        //1.3.1
        Student vasya = new Student("Вася", 3, 4, 5);
        Student petya = new Student("Петя");
        petya.setGrades(vasya.getGrades());
        petya.setGrade(0, 5);

        System.out.println(vasya);
        System.out.println(petya);
        // После инкапсуляции оценок Петя получает отдельный список.

        Student andrey = new Student("Андрей");
        andrey.setGrades(new ArrayList<>(vasya.getGrades()));
        vasya.setGrade(1, 2);

        System.out.println("После изменения оценок Васи:");
        System.out.println(vasya);
        System.out.println(andrey);
        // Оценки Андрея не меняются: у него отдельный список.
        //1.3.1

        //1.4.7
        Student vasyaWithGrades = new Student("Вася", 3, 4, 5);
        Student maxim = new Student("Максим");
        System.out.println(vasyaWithGrades);
        System.out.println(maxim);
        //1.4.7

        //1.5.6
        Student vasyaForGrades = new Student("Вася", 3, 4, 5, 4);
        Student petyaForGrades = new Student("Петя", 5, 5, 5, 5);
        System.out.println(vasyaForGrades + ", средний балл: "
                + vasyaForGrades.getAverageGrade() + ", отличник: "
                + vasyaForGrades.isExcellentStudent());
        System.out.println(petyaForGrades + ", средний балл: "
                + petyaForGrades.getAverageGrade() + ", отличник: "
                + petyaForGrades.isExcellentStudent());
        //1.5.6

        //1.6.8
        Student checkedStudent = new Student("Проверка", 2, 5);
        List<Integer> externalGrades = new ArrayList<>(List.of(2, 5));
        checkedStudent.setGrades(externalGrades);
        externalGrades.set(0, 1);
        checkedStudent.addGrade(4);
        System.out.println("Допустимые оценки: " + checkedStudent.getGrades());
        try {
            new Student("Ошибка", 6);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        try {
            checkedStudent.addGrade(1);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        try {
            checkedStudent.setGrades(List.of(2, 6));
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        try {
            checkedStudent.getGrades().set(0, 1);
        } catch (UnsupportedOperationException error) {
            System.out.println("Полученный список оценок нельзя изменить");
        }
        System.out.println("Оценки после проверок: " + checkedStudent.getGrades());
        //1.6.8
    }
}
