package moves;
import ru.ifmo.se.pokemon.*;

public class Air_Slash extends SpecialMove{
    public Air_Slash(){
        super(Type.FLYING, 75, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<0.3) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "наносит воздушный удар, чем пугает противника";
    }
}
