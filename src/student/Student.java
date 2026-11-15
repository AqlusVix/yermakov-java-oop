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
            this.grades.add(grade);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
