import ru.ifmo.se.pokemon.Type;

public class Hitmonlee extends Tyrogue {
    public Hitmonlee (String name, int level) {
        super(name, level);
        setStats(50, 120, 53, 35, 110, 87);
        setType(Type.FIGHTING);
        setMove(new WorkUp(), new Bulldoze(), new Swagger(), new PoisonJab());
    }
}
