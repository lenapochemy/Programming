package pokemon;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Ninjask extends Nincada{
    private double hp = 61;
    private double att = 90;
    private double def = 45;
    private double spAtt = 50;
    private double spDef = 50;
    private double speed = 160;

    public Ninjask() {
        super();
        setType(Type.BUG, Type.FLYING);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Swords_Dance());
    }

    public Ninjask(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.FLYING);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Swords_Dance());
    }
}
