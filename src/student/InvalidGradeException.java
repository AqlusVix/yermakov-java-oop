package student;

public class InvalidGradeException extends IllegalArgumentException {
    public InvalidGradeException() {
    }

    public InvalidGradeException(String studentName) {
        super(studentName);
    }
}
