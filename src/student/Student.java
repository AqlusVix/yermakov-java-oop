package student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    private final GradeRule gradeRule;

    public Student(String name, int... grades) {
        this(name, null, grades);
    }

    public Student(String name, GradeRule gradeRule, int... grades) {
        this.name = name;
        this.gradeRule = gradeRule;
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

    private void checkGrade(Integer grade) {
        if (grade == null || (gradeRule != null && !gradeRule.isValid(grade))) {
            throw new IllegalArgumentException("Оценка не соответствует правилу");
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
