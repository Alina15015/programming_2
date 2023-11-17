import ru.ifmo.se.pokemon.Type;

public class Swadloon extends Sewaddle {
    public Swadloon (String name, int level) {
        super(name, level);
        setStats(55, 63, 90, 50, 80, 42);
        setType(Type.BUG, Type.GRASS);
        setMove(new Swagger(), new Facade(), new GrassWhistle());
    }
}
