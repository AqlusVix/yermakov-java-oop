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

        //1.2.2
        Human cleopatra = new Human(new Name("Клеопатра"), 152);
        Human pushkin = new Human(new Name("Пушкин", "Александр", "Сергеевич"), 167);
        Human mayakovsky = new Human(new Name("Маяковский", "Владимир"), 189);
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovsky);
        //1.2.2

        //1.2.3
        Human ivan = new Human(new Name("Чудов", "Иван"), 175);
        Human petr = new Human(new Name("Чудов", "Петр"), 180, ivan);
        Human boris = new Human(new Name("Борис"), 170, petr);
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
        //1.2.3
    }
}
