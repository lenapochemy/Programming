package pokemon;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Nincada extends Pokemon{
    private double hp = 31;
    private double att = 45;
    private double def = 90;
    private double spAtt = 30;
    private double spDef = 30;
    private double speed = 40;

    public Nincada() {
        super();
        setType(Type.BUG, Type.GROUND);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Leech_Life(), new Shadow_Ball(), new Double_Team());
    }

    public Nincada(java.lang.String name, int level) {
        super(name, level);
        setStats(hp, att, def, spAtt, spDef, speed);
        setMove(new Leech_Life(), new Shadow_Ball(), new Double_Team());
    }
}
