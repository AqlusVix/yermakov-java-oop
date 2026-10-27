package person;

public class Name {
    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String lastName, String firstName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Name(String firstName){
        this("", firstName, "");
    }

    public Name(String lastName, String firstName){
        this(lastName, firstName, "");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String result = "";

        if (lastName != null && !lastName.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += lastName;
        }

        if (firstName != null && !firstName.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += firstName;
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            if (!result.isEmpty()) {
                result += " ";
            }
            result += patronymic;
        }

        return result;
    }
}
