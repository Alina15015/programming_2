import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam () {
        super(Type.NORMAL, 0, 0);
    }

    protected void applySelfEffects (Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }

    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    protected String describe() {
        return "использует атаку Double Team";
    }
}
