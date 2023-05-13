package moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        p.setMod(Stat.HP, Stat.HP.ordinal());
    }

    @Override
    protected boolean checkAccuracy (Pokemon att,Pokemon def){
        return true;
    }

    @Override
    protected String describe(){
        return "лечится сном";
    }
}
