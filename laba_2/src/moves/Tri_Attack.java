package moves;
import ru.ifmo.se.pokemon.*;

public class Tri_Attack extends SpecialMove{
    public Tri_Attack(){
        super(Type.NORMAL, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        double a = Math.random();
        if(a < 0.67) Effect.paralyze(p);
        if(0.66 < a && a < 13.34) Effect.burn(p);
        if(13.33 < a && a < 20.01) Effect.freeze(p);
    }

    @Override
    protected String describe(){
        return "наносит тройную атаку";
    }
}
