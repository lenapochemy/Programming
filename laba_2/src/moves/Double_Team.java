package moves;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove{
    public Double_Team(){
        super();
    }

    @Override
    protected void applySelfEffects (Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.EVASION, +1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "уклоняется от атаки";
    }
}
