import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.DamageMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class FoulPlay extends DamageMove {
    public FoulPlay () {
        super(Type.DARK, 95, 100);
    }

    protected double calcAttDefFactor(Pokemon att, Pokemon def) {
        return def.getStat(Stat.ATTACK) / def.getStat(Stat.DEFENSE);
    }

    protected String describe() {
        return "использует атаку Foul Play";
    }
}
