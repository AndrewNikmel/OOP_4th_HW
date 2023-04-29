public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
    }

    public Warrior fight() {
        while (one.getHP() > 0 && two.getHP() > 0) {
            int hit1 = one.hit();
            System.out.printf("The first warrior hit damage makes %s points. \n", hit1);
            two.setHP(two.getHP() - hit1);
            System.out.printf("%s HP remains by the second warrior. \n", two.getHP());
            if (two.getHP() <= 0) {
                return one;
            }
            int hit2 = two.hit();
            System.out.printf("The second warrior hit damage makes %s points. \n", hit2);
            one.setHP(one.getHP() - hit2);
            System.out.printf("%s HP remains by the first warrior. \n", one.getHP());
            System.out.println("They continue the battle");
        }
        return two;
    }
}
