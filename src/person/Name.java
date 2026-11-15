package person;

public class Name {
    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Name(String firstName, String lastName, String patronymic) {
        if (isBlank(firstName) && isBlank(lastName) && isBlank(patronymic)) {
            throw new IllegalArgumentException("Хотя бы одна часть имени должна быть заполнена");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Name(String firstName){
        this(firstName, "", "");
    }

    public Name(String firstName, String lastName){
        this(firstName, lastName, "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    private static boolean isBlank(String value) {
        return value == null || value.isBlank();
    }

    @Override
    public String toString() {
        String result = "";

        if (!isBlank(lastName)) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += lastName;
        }

        if (!isBlank(firstName)) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += firstName;
        }

        if (!isBlank(patronymic)) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += patronymic;
        }

        return result;
    }
}
