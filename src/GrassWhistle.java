import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class GrassWhistle extends StatusMove {
    public GrassWhistle () {
        super(Type.GRASS, 0, 55);
    }

    protected void applyOppEffects (Pokemon p) {
        Effect.sleep(p);
    }

    protected String describe() {
        return "использует атаку Grass Whistle";
    }
}
