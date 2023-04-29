import java.util.ArrayList;
import java.util.List;

public class Team <T>{
    List <T> team = new ArrayList<>();

    public Team <T> add(T warrior){
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
        return warriors.toString();
    }
} 
