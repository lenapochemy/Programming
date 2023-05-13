public class Things extends Entity{

    public Things(String name){
        super(name);
    }

    public Actions action;

    public Actions getAction(){
        return action;
    }

    public void setActions(Actions action){
        this.action = action;
        System.out.println(getName() + " " + this.action.getActions() );
    }

    public void setActionQuiet(Actions action){
        this.action = action;
    }

    public void flaunt(Things thing){
        this.setActionQuiet(Actions.FLAUNT);
        System.out.println(getName() + " " + this.action.getActions() + " " + thing.getName());

    }

    private Features feature;

    public Features getFeatures(){
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
        Things check = (Things) o;
        return hashCode() == check.hashCode();
    }
}
