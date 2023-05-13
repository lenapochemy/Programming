package moves;
import ru.ifmo.se.pokemon.*;

public class Defense_Curl extends StatusMove{
    public Defense_Curl(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().turns(1).stat(Stat.DEFENSE, +1);
    }

    @Override
    protected String describe(){
        return "повышает себе защиту";
    }
}
