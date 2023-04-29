public class Assassin extends Warrior{

    public Assassin(String name, Knife knife, int healthpoint) {
        super(name, knife, healthpoint);
    }

    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }
    
}
