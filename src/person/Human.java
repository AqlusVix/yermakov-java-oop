package person;

public class Human {
    private Name name;
    private int height;
    private Human father;

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

    public void setFather(Human father) {
        this.father = father;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        String first = name == null ? null : name.getFirstName();
        String last = name == null ? null : name.getLastName();
        String patronymic = name == null ? null : name.getPatronymic();

        if (father != null && father.getName() != null) {
            Name fatherName = father.getName();
            if (!hasText(last)) {
                last = fatherName.getLastName();
            }
            if (!hasText(patronymic) && hasText(fatherName.getFirstName())) {
                patronymic = fatherName.getFirstName() + "ович";
            }
        }

        StringBuilder result = new StringBuilder();
        appendPart(result, last);
        appendPart(result, first);
        appendPart(result, patronymic);
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
