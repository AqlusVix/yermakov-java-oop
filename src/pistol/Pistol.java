package pistol;

public class Pistol extends Weapon {
    private final int maxBullets;

    public Pistol(int bullets) {
        this(bullets, bullets);
    }

    public Pistol() {
        this(5);
    }

    public Pistol(int maxBullets, int bullets) {
        super(bullets);
        if (maxBullets < 0 || bullets > maxBullets) {
            throw new IllegalArgumentException("Количество патронов должно быть от 0 до вместимости");
        }
        this.maxBullets = maxBullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public int getBullets() {
        return ammo();
    }

    public boolean isLoaded() {
        return ammo() > 0;
    }

    @Override
    public int load(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Отрицательного числа патронов быть не может");
        }
        int loaded = Math.min(amount, maxBullets - ammo());
        super.load(loaded);
        return amount - loaded;
    }

    public int unload() {
        return clearAmmo();
    }

    @Override
    public void shoot() {
        if (getAmmo()) {
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }
}
