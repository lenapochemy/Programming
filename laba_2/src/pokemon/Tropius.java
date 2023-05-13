package pokemon;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Tropius extends Pokemon{
    private double hp = 99;
    private double att = 68;
    private double def = 83;
    private double spAtt = 72;
    private double spDef = 87;
    private double speed = 51;

    public Tropius() {
        super();
        setType(Type.GRASS, Type.FLYING);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Body_Slam(), new  Headbutt(), new Air_Slash(), new Leer());
    }

    public Tropius(String name, int level) {
        super(name, level);
        setType(Type.GRASS, Type.FLYING);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Body_Slam(), new  Headbutt(), new Air_Slash(), new Leer());
    }

}
