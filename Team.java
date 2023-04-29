import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> team = new ArrayList<>();

    public Team<T> add(T warrior) {
        team.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for (T item : team) {
            warriors.append(item);
            warriors.append("\n");
        }
        warriors.append(String.format("healthpoint %s, damage is %s, maximal range is %s", healthpoints(), getDamage(),
                maxRange()));
        return warriors.toString();
    }

    public int healthpoints() {
        int sum = 0;
        for (T item : team) {
            sum += item.getHP();
        }
        return sum;
    }

    public int getDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange() {
        int max = 0;
        for (T item : team) {
            if (item instanceof Archer) {
                if (max < ((Archer) item).range()) { // приведение item к типу archer
                    max = ((Archer) item).range();
                }
            }
        }
        return max;
    }
}
