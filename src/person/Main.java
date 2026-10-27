package person;

public class Main {
    public static void main(){
        //1.1.2
        Human human1 = new Human("Клеопатра", 152);
        Human human2 = new Human("Пушкин", 167);
        Human human3 = new Human("Александр", 189);

        System.out.println(human1 + ", " + human2 + ", " + human3);
        //1.1.2

        //1.1.3
        Name name1 = new Name("Клеопатра");
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир");

        System.out.println(name1 + ", " + name2 + ", " + name3);
        //1.1.3

        //
    }
}
