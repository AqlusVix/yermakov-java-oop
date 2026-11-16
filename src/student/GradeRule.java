package student;

@FunctionalInterface
public interface GradeRule {
    boolean isValid(int grade);
}
