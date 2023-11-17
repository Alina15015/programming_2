import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Confide extends StatusMove {
    public Confide () {
        super(Type.NORMAL, 0, 0);
    }

    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected String describe() {
        return "использует атаку Confide";
    }
}
