import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private String name;
    protected T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    private int healthpoint;
    private Shield shield;

    public Warrior(String name, T weapon, int healthpoint, Shield shield) {
        this.name = name;
        this.weapon = weapon;
        this.healthpoint = healthpoint;
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("Name - %s, has %s, has %d healthpoints and %s", name, weapon, healthpoint, shield);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int getHP() {
        return healthpoint;
    }

    public void setHP(int healthpoint) {
        this.healthpoint = healthpoint;
    }

    public int safety() {
        Random random = new Random();
        return random.nextInt(shield.protection());
    }

    public int holy() {
        Random random = new Random();
        return random.nextInt(shield.healing());
    }

}
