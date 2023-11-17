import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Klefki p1 = new Klefki("Клефки", 1);
        Tyrogue p2 = new Tyrogue("Тайрог", 1);
        Hitmonlee p3 = new Hitmonlee("Хитмонли", 1);
        Sewaddle p4 = new Sewaddle("Сьюэдл", 1);
        Swadloon p5 = new Swadloon("Суэдлун", 1);
        Leavanny p6 = new Leavanny("Ливанни", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}