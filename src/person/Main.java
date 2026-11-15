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
        Name name2 = new Name("Александр", "Пушкин", "Сергеевич");
        Name name3 = new Name("Владимир", "Маяковский");

        System.out.println(name1 + ", " + name2 + ", " + name3);
        //1.1.3

        //1.2.2
        Human cleopatra = new Human(new Name("Клеопатра"), 152);
        Human pushkin = new Human(new Name("Александр", "Пушкин", "Сергеевич"), 167);
        Human mayakovsky = new Human(new Name("Владимир", "Маяковский"), 189);
        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovsky);
        //1.2.2

        //1.2.3
        Human ivan = new Human(new Name("Иван", "Чудов"), 175);
        Human petr = new Human(new Name("Петр", "Чудов"), 180, ivan);
        Human boris = new Human(new Name("Борис"), 170, petr);
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(boris);
        //1.2.3

        //1.4.5
        System.out.println(new Name("Клеопатра"));
        System.out.println(new Name("Александр", "Пушкин", "Сергеевич"));
        System.out.println(new Name("Владимир", "Маяковский"));
        System.out.println(new Name("Христофор", "Бонифатьевич"));
        //1.4.5

        //1.4.6
        Human lev = new Human("Лев");
        Human sergey = new Human(lev, new Name("Сергей", "Пушкин"));
        Human alexander = new Human(sergey, "Александр");
        System.out.println(lev);
        System.out.println(sergey);
        System.out.println(alexander);
        //1.4.6

        //1.5.4
        Human grandfather = new Human(new Name("Иван", "Чудов"));
        Human fatherWithoutSurname = new Human(grandfather, "Петр");
        Human sonWithoutSurname = new Human(fatherWithoutSurname, "Борис");
        System.out.println("Личное имя: " + sonWithoutSurname.getFirstName());
        System.out.println("Отчество: " + sonWithoutSurname.getPatronymic());
        System.out.println("Фамилия деда: " + sonWithoutSurname.getLastName());
        System.out.println(sonWithoutSurname);
        //1.5.4

        //1.6.2
        Name immutableName = new Name("Анна");
        System.out.println("Неизменяемое имя: " + immutableName);
        try {
            new Name(null, "", " ");
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        // У Name нет сеттеров, поэтому части имени после создания не изменить.
        //1.6.2

        //1.6.7
        Human son = new Human(lev, "Михаил");
        System.out.println("Отец: " + son.getFather());
        System.out.println("Имя как объект: " + son.getName());
        // У Human нет сеттера отца: связь задается только в конструкторе.
        //1.6.7
    }
}
