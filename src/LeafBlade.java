import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class LeafBlade extends PhysicalMove {
    public LeafBlade () {
        super(Type.GRASS, 90, 100);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (0.125 > Math.random()) {
            return 2;
        }
        return 1;
    }

    protected String describe() {
        return "использует атаку Leaf Blade";
    }
}
