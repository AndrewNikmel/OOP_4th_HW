public class Assassin extends Warrior<Knife> {

    public Assassin(String name, Knife knife, int healthpoint, SteelShield sSh) {
        super(name, knife, healthpoint, sSh);
    }

    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }

}
