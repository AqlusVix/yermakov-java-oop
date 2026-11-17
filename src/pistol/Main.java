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

        //2.1.4
        MachineGun standard = new MachineGun();
        MachineGun halfRate = new MachineGun(10);
        MachineGun automatic = new MachineGun(10, 3);
        System.out.println("Автомат по умолчанию: вместимость " + standard.getMaxBullets()
                + ", скорострельность " + standard.getFireRate());
        System.out.println("Автомат с обоймой 10: скорострельность " + halfRate.getFireRate());
        automatic.load(10);
        automatic.shoot();
        automatic.shoot(2);
        System.out.println("Осталось патронов: " + automatic.getBullets());
        try {
            new MachineGun(10, 0);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
        //2.1.4

        //2.2.1
        Weapon weapon = new Pistol(2);
        weapon.shoot();
        System.out.println("Патронов в оружии: " + weapon.ammo());
        // Weapon нельзя создать напрямую: это абстрактный класс.
        //2.2.1

        //2.3.8
        Shooter withoutWeapon = new Shooter("Первый");
        Shooter withPistol = new Shooter("Второй");
        Shooter withMachineGun = new Shooter("Третий");
        withPistol.setWeapon(new Pistol(1));
        MachineGun shooterMachineGun = new MachineGun(3, 2);
        shooterMachineGun.load(3);
        withMachineGun.setWeapon(shooterMachineGun);
        System.out.println(withoutWeapon.getName() + ":");
        withoutWeapon.shoot();
        System.out.println(withPistol.getName() + ":");
        withPistol.shoot();
        System.out.println(withMachineGun.getName() + ":");
        withMachineGun.shoot();
        //2.3.8

        //3.2.2
        Pistol inheritedAmmo = new Pistol(4);
        System.out.println("Патронов извлечено: " + inheritedAmmo.unload());
        System.out.println("Патронов осталось: " + inheritedAmmo.ammo());
        //3.2.2
    }
}
