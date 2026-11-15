package pistol;

public class Pistol {
    private int bullets;
    private final int maxBullets;

    public Pistol(int bullets) {
        this(bullets, bullets);
    }

    public Pistol() {
        this(5);
    }

    public Pistol(int maxBullets, int bullets) {
        if (maxBullets < 0 || bullets < 0 || bullets > maxBullets) {
            throw new IllegalArgumentException("Количество патронов должно быть от 0 до вместимости");
        }
        this.maxBullets = maxBullets;
        this.bullets = bullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public int getBullets() {
        return bullets;
    }

    public boolean isLoaded() {
        return bullets > 0;
    }

    public int load(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Отрицательного числа патронов быть не может");
        }
        int loaded = Math.min(amount, maxBullets - bullets);
        bullets += loaded;
        return amount - loaded;
    }

    public int unload() {
        int removed = bullets;
        bullets = 0;
        return removed;
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
