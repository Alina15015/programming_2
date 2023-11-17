import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.DamageMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Status;

public class Facade extends DamageMove {
    public Facade () {
        super(Type.NORMAL, 70, 100);
    }

    protected final double calcAttDefFactor(Pokemon att, Pokemon def) {
        if (def.getCondition() == Status.BURN || def.getCondition() == Status.POISON || def.getCondition() == Status.PARALYZE) {
            return 2 * att.getStat(Stat.ATTACK) / def.getStat(Stat.DEFENSE);
        }
        return att.getStat(Stat.ATTACK) / def.getStat(Stat.DEFENSE);
    }

    protected String describe() {
        return "использует атаку Facade";
    }
}
