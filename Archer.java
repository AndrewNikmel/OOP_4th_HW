import java.util.Random;

public class Archer extends Warrior<Bow>{
    public Archer(String name, Bow bow, int healthpoint) {
        super(name, bow, healthpoint);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }
    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
