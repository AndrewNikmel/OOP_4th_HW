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
            int hit1a = hit1 - one.safety();
            System.out.printf("The first hits the second.\nThe power of the hit was %s, but due the shield damage makes %s \n", hit1, hit1a);
            System.out.printf("The shield also gives %s points of health to the second hero \n", two.holy());
            two.setHP(two.getHP() - hit1a + two.holy());
            System.out.printf("%s HP remains by the second warrior. \n", two.getHP());
            if (two.getHP() <= 0) {
                return one;
            }
            int hit2 = two.hit();
            int hit2a = hit2 - two.safety();
            System.out.printf("The second hits the first.\nThe power of the hit was %s, but due the shield damage makes %s \n", hit2, hit2a);
            System.out.printf("The shield also gives %s points of health to the first hero\n", one.holy());
            one.setHP(one.getHP() - hit2a + one.holy());
            System.out.printf("%s HP remains by the second warrior. \n", one.getHP());
            System.out.println("--They continue the battle--");
        }
        return two;
    }
}
