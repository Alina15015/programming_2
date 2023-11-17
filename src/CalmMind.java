import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class CalmMind extends StatusMove {
    public CalmMind () {
        super(Type.PSYCHIC, 0, 0);
    }

    protected void applySelfEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected String describe() {
        return "использует атаку Calm Mind";
    }
}
