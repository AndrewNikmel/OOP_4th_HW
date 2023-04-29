public class Bow implements Weapon{
    @Override
    public int damage() {
        return 20;
    }

    public int range(){
        return 50;
    }

    @Override
    public String toString() {
        return String.format("bow, what maximal damage is %d, max range is %d", damage(), range());
    }
}
