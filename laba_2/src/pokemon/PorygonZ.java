package pokemon;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class PorygonZ extends Porygon2{
    private double hp = 85;
    private double att = 80;
    private double def = 70;
    private double spAtt = 135;
    private double spDef = 75;
    private double speed = 90;

    public PorygonZ() {
        super();
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Tri_Attack());
    }

    public PorygonZ(String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Tri_Attack());
    }

}
