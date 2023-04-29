public class GoldenShield implements Shield {
    @Override
    public int protection() {
        return 9;
    }

    public int healing(){
        return 7;
    }

    @Override
    public String toString() {
        return String.format("the holy shield is made of gold, gives %d points of protection and heals the owner on %d points", protection(), healing());
    }
}
