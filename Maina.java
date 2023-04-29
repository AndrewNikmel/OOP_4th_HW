public class Maina {

    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("Legolas", new Bow(), 30))
                .add(new Archer("Jorje", new Bow(), 25));

        Team<Assassin> assassTeam = new Team<>();
        assassTeam.add(new Assassin("Desmond", new Knife(), 70))
                .add(new Assassin("Rhadunagheidu", new Knife(), 35));

        System.out.println(archersTeam);
        System.out.println(assassTeam);

        Battle battle = new Battle(new Archer("Sam", new Bow(), 30), new Assassin("Connor", new Knife(), 40));
        Warrior winner = battle.fight();
        System.out.println(winner);
    }
}