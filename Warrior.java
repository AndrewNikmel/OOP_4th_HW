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

    public Warrior(String name, T weapon, int healthpoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthpoint = healthpoint;
    }

    @Override
    public String toString() {
        return String.format("Name is %s, the weapon is %s, has %d healthpoints", name, weapon, healthpoint);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int getHP() {
        return healthpoint;
    }

    public void setHP() {
        this.healthpoint = healthpoint;
    }

    public void setHP(int i) {
    }
}
