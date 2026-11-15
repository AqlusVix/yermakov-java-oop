package student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        //1.3.1
        Student vasya = new Student("Вася", new ArrayList<>(List.of(3, 4, 5)));
        Student petya = new Student("Петя", vasya.getGrades());
        petya.getGrades().set(0, 5);

        System.out.println(vasya);
        System.out.println(petya);
        // У Васи тоже появилась пятерка: оба студента ссылаются на один список.

        Student andrey = new Student("Андрей", new ArrayList<>(vasya.getGrades()));
        vasya.getGrades().set(1, 2);

        System.out.println("После изменения оценок Васи:");
        System.out.println(vasya);
        System.out.println(andrey);
        // Оценки Андрея не меняются: у него отдельный список.
        //1.3.1
    }
}
