import java.util.Random;

public abstract class Warrior {
    private String name;
    private Weapon weapon;
    private int healthpoint;

    public Warrior(String name, Weapon weapon, int healthpoint){
        this.name = name;
        this.weapon = weapon;
        this.healthpoint = healthpoint;
    }

    @Override
    public String toString() {
        return String.format("Name is %s, the weapon is %s, has %d healthpoints", name, weapon, healthpoint);
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}
