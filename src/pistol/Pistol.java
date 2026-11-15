package pistol;

public class Pistol {
    private int bullets;

    public Pistol(int bullets) {
        if (bullets < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.bullets = bullets;
    }

    public Pistol() {
        this(5);
    }

    public void shoot() {
        if (bullets > 0) {
            System.out.println("Бах!");
            bullets--;
        } else {
            System.out.println("Клац!");
        }
    }
}
