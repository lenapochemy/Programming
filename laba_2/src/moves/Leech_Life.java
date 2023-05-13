package moves;
import ru.ifmo.se.pokemon.*;

public class Leech_Life extends PhysicalMove{
    public Leech_Life(){
        super(Type.BUG, 80, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, Stat.HP.ordinal());
    }

    @Override
    protected String describe(){
        return "восстанавливает здоровье";
    }
}
