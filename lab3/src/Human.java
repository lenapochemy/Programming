public class Human extends Entity{

    public Human (String name){
        super(name);
    }

    private Actions action;
    public Actions getAction() {
        return action;
    }

    public void setActions(Actions action){
        this.action = action;
        System.out.println(getName() + " " + this.action.getActions());
    }

    public void setActionsQuiet(Actions action){
      this.action = action;
    }

    public void bring(Dishes dish){
        this.setActionsQuiet(Actions.BRING);
        System.out.println(getName() + " " + this.action.getActions() + " " + dish.getName() + " с " + dish.getContent());
    }

    public void take(Dishes dish){
        this.setActionsQuiet(Actions.TAKE);
        System.out.println(getName() + " " + this.action.getActions() + " " + dish.getName() + " с " + dish.getContent());
    }

    public void invite(Things thing, Human human){
        this.setActionsQuiet(Actions.INVITE);
        System.out.println(getName() + " " + this.action.getActions() + " " +
                thing.getName() + " " + human.getName());
    }

    public void spill(Dishes dish,Things thing){
        this.setActionsQuiet(Actions.SPILL);
        System.out.println(getName() + " " + this.action.getActions() + " " +
                dish.getContent() + " в " + thing.getName());
    }
    private Features feature;
    public Features getFeatures() {
        return feature;
    }

    public void setFeatures(Features feature){
        this.feature = feature;
        System.out.println(getName() + " " + this.feature.getFeatures());
    }



    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if( o == null || o.getClass() != getClass()) {
            return false;
        }
        Human check = (Human) o;
        return hashCode() == check.hashCode();
    }
}
