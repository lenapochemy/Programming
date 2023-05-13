package moves;
import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "замораживает цель метелью";
    }


}
