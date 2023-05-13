package moves;
import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove{
    public Leer(){
        super();
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(1).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){

        return "хитрит и снижает защиту противника";
    }
}
