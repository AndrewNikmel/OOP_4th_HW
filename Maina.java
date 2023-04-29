public class Maina {

    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("Legolas", new Bow(), 50, new GoldenShield()))
                .add(new Archer("Jorje", new Bow(), 55, new GoldenShield()))
                .add(new Archer("Jarvis", new Bow(), 58, new GoldenShield()));

        Team<Assassin> assassTeam = new Team<>();
        assassTeam.add(new Assassin("Desmond", new Knife(), 60, new SteelShield()))
                .add(new Assassin("Rhadunagheidu", new Knife(), 65, new SteelShield()))
                .add(new Assassin("Hethway", new Knife(), 66, new SteelShield()));
        System.out.println(archersTeam);
        System.out.println(assassTeam);

        Battle battle = new Battle(new Archer("Sam", new Bow(), 40, new GoldenShield()),
                new Assassin("Connor", new Knife(), 50, new SteelShield()));
        Warrior winner = battle.fight();
        System.out.printf("!!! %s wins the battle !", winner);
        System.out.printf("\n The weakest shield by Assassins has %s \n", assassTeam.weakestShield());
        System.out.printf("The weakest shield by Archers has %s \n", archersTeam.weakestShield());

        
    }
}