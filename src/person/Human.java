package person;

public class Human {
    private Name name;
    private int height;
    private final Human father;

    public Human(Name name, int height, Human father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(String name, int height) {
        this(new Name(name), height);
    }

    public Human(String name) {
        this(new Name(name));
    }

    public Human(Name name) {
        this(name, 0, null);
    }

    public Human(Human father, String name) {
        this(father, new Name(name));
    }

    public Human(Human father, Name name) {
        this(name, 0, father);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Human getFather() {
        return father;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFirstName() {
        return name == null ? null : name.getFirstName();
    }

    public String getPatronymic() {
        String patronymic = name == null ? null : name.getPatronymic();
        if (hasText(patronymic)) {
            return patronymic;
        }
        if (father != null && hasText(father.getFirstName())) {
            return father.getFirstName() + "ович";
        }
        return null;
    }

    public String getLastName() {
        Human current = this;
        while (current != null) {
            if (current.name != null && hasText(current.name.getLastName())) {
                return current.name.getLastName();
            }
            current = current.father;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        appendPart(result, getLastName());
        appendPart(result, getFirstName());
        appendPart(result, getPatronymic());
        return result.toString();
    }

    private static boolean hasText(String value) {
        return value != null && !value.isBlank();
    }

    private static void appendPart(StringBuilder result, String value) {
        if (hasText(value)) {
            if (result.length() > 0) {
                result.append(' ');
            }
            result.append(value);
        }
    }
}
