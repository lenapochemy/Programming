package moves;
import ru.ifmo.se.pokemon.*;

public class Body_Slam extends PhysicalMove{
    public Body_Slam(){
        super(Type.NORMAL, 85, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.3).turns(1).condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "сильно бьет противника, возможно до паралича";
    }
}
