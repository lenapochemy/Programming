package pokemon;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Porygon2 extends Porygon{
    private double hp = 85;
    private double att = 80;
    private double def = 90;
    private double spAtt = 105;
    private double spDef = 95;
    private double speed = 60;

    public Porygon2() {
        super();
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Defense_Curl());
    }

    public Porygon2(String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        addMove(new Defense_Curl());
    }

}
