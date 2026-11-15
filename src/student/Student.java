package student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, int... grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        for (int grade : grades) {
            addGrade(grade);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return List.copyOf(grades);
    }

    public void setGrades(List<Integer> grades) {
        List<Integer> checked = new ArrayList<>();
        for (Integer grade : grades) {
            checkGrade(grade);
            checked.add(grade);
        }
        this.grades = checked;
    }

    public void addGrade(int grade) {
        checkGrade(grade);
        grades.add(grade);
    }

    public void setGrade(int index, int grade) {
        checkGrade(grade);
        grades.set(index, grade);
    }

    private static void checkGrade(Integer grade) {
        if (grade == null || grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public boolean isExcellentStudent() {
        if (grades.isEmpty()) {
            return false;
        }
        for (int grade : grades) {
            if (grade != 5) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
