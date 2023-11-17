import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Klefki extends Pokemon {
    public Klefki (String name, int level) {
        super(name, level);
        setStats(57, 80, 91, 80, 87, 75);
        setType(Type.STEEL, Type.FAIRY);
        setMove(new FoulPlay(), new CalmMind(), new Confide(), new DoubleTeam());
    }
}
