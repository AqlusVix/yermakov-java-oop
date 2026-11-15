package pistol;

public class Main {
    public static void main() {
        //1.5.1
        Pistol pistol = new Pistol(3);
        for (int i = 0; i < 5; i++) {
            pistol.shoot();
        }
        //1.5.1

        //1.6.5
        Pistol sevenShot = new Pistol(7, 0);
        sevenShot.load(3);
        for (int i = 0; i < 5; i++) {
            sevenShot.shoot();
        }
        int extra = sevenShot.load(8);
        sevenShot.shoot();
        sevenShot.shoot();
        int unloaded = sevenShot.unload();
        sevenShot.shoot();
        System.out.println("Вместимость: " + sevenShot.getMaxBullets()
                + ", лишних патронов: " + extra
                + ", извлечено: " + unloaded
                + ", заряжено сейчас: " + sevenShot.getBullets()
                + ", заряжен: " + sevenShot.isLoaded());
        try {
            sevenShot.load(-1);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        //1.6.5
    }
}
