package moves;
import ru.ifmo.se.pokemon.*;
public class Shadow_Ball extends SpecialMove{
    public Shadow_Ball(){
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().turns(1).chance(0.2).stat(Stat.SPECIAL_DEFENSE,-1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "использует теневой шар, уменьшает защиту противника";
    }
}
