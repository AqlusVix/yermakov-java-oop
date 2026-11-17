package pistol;

public abstract class Weapon {
    protected int ammo;

    public Weapon(int ammo) {
        if (ammo < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.ammo = ammo;
    }

    public int ammo() {
        return ammo;
    }

    public boolean getAmmo() {
        if (ammo == 0) {
            return false;
        }
        ammo--;
        return true;
    }

    public int load(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Отрицательного числа патронов быть не может");
        }
        ammo = Math.addExact(ammo, amount);
        return 0;
    }

    public abstract void shoot();
}
