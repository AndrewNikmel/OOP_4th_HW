public class SteelShield implements Shield {
    @Override
    public int protection() {
        return 5;
    }

    @Override
    public int healing() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("the shield is made of steel and gives %d points of protection and %d points of healing", protection(), healing());
    }
}
