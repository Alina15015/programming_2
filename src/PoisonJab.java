import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public class PoisonJab extends PhysicalMove {
    public PoisonJab () {
        super(Type.POISON, 80, 100);
    }

    protected void applyOppEffects (Pokemon p) {
        Effect e = new Effect().condition(Status.POISON).chance(0.3);
        p.addEffect(e);
    }

    protected String describe() {
        return "использует навык PoisonJab";
    }
}
