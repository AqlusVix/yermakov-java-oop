package house;

public class Main {
    public static void main(){
        //1.1.5
        House h1 = new House(1);
        House h2 = new House(5);
        House h3 = new House(23);

        System.out.println(h1 + ", " + h2 + ", " + h3);
        //1.1.5

        //1.4.4
        House house2 = new House(2);
        House house35 = new House(35);
        House house91 = new House(91);
        System.out.println(house2);
        System.out.println(house35);
        System.out.println(house91);
        // house2.setNumberOfFloors(3); // Ошибка компиляции: у Дома нет сеттера.
        //1.4.4
    }
}
