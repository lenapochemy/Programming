package moves;
import ru.ifmo.se.pokemon.*;

public class Swords_Dance extends StatusMove{
    public Swords_Dance(){
        super();
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(1).turns(1).stat(Stat.ATTACK, +2);
    }

    @Override
    protected String describe(){
        return "повышает свою атаку";
    }
}
