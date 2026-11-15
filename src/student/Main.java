package student;

import java.util.ArrayList;

public class Main {
    public static void main() {
        //1.3.1
        Student vasya = new Student("Вася", 3, 4, 5);
        Student petya = new Student("Петя");
        petya.setGrades(vasya.getGrades());
        petya.getGrades().set(0, 5);

        System.out.println(vasya);
        System.out.println(petya);
        // У Васи тоже появилась пятерка: оба студента ссылаются на один список.

        Student andrey = new Student("Андрей");
        andrey.setGrades(new ArrayList<>(vasya.getGrades()));
        vasya.getGrades().set(1, 2);

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
    }
}
