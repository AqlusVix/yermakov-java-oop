package student;

import java.util.ArrayList;
import java.util.List;

public class StudentUtils {
    public static String addRandomGrades(List<Student> students) {
        List<List<Integer>> previousGrades = new ArrayList<>();
        for (Student student : students) {
            previousGrades.add(student.getGrades());
        }

        try {
            for (Student student : students) {
                int grade = (int) (Math.random() * 10) + 1;
                student.addGrade(grade);
            }
            return "Оценки добавлены всем студентам";
        } catch (InvalidGradeException error) {
            for (int i = 0; i < students.size(); i++) {
                students.get(i).setGrades(previousGrades.get(i));
            }
            return "Оценки не добавлены: недопустимая оценка для студента "
                    + error.getMessage();
        }
    }
}
