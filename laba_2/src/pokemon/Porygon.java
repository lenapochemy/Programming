package pokemon;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Porygon extends Pokemon {
    private double hp = 65;
    private double att = 60;
    private double def = 70;
    private double spAtt = 85;
    private double spDef = 75;
    private double speed = 40;

    public Porygon() {
        super();
        setType(Type.NORMAL);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Rest(), new  Blizzard());
    }

    public Porygon(java.lang.String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Rest(), new Blizzard());
    }


}