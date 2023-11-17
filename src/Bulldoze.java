import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Bulldoze extends PhysicalMove {
    public Bulldoze () {
        super(Type.GROUND, 60, 100);
    }

    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }

    protected String describe() {
        return "использует навык Bulldoze";
    }
}
