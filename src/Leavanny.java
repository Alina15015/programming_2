import ru.ifmo.se.pokemon.Type;

public class Leavanny extends Swadloon {
    public Leavanny (String name, int level) {
        super(name, level);
        setStats(75, 103, 80, 70, 80, 92);
        setType(Type.BUG, Type.GRASS);
        setMove(new Swagger(), new Facade(), new GrassWhistle(), new LeafBlade());
    }
}
