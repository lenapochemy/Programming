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

    public void sit(Things thing){
        this.setActionsQuiet(Actions.SIT_DOWN);
        System.out.println(getName() + " " + this.action.getActions() + " " +  thing.getName());
    }

    public void scream(String phrase) throws PhraseException{
        this.setActionsQuiet(Actions.SCREAM);
        if(phrase != "") {
            System.out.println(getName() + " " + this.action.getActions() + " " + phrase);
        } else {
            throw new PhraseException(getName() + " промолчал, вместо крика");
        }

    }
    public void treat(Dishes dish){
        this.setActionsQuiet(Actions.TREAT);
        System.out.println(getName() + " " + this.action.getActions() + " " + dish.getContent());
    }
    private Features feature;
    public Features getFeatures() {
        return feature;
    }

    public void setFeatures(Features feature){
        this.feature = feature;
        System.out.println(getName() + " " + this.feature.getFeatures());
    }


    public static class Dog {
        private Human owner;
        private String name;

        public Human getOwner(){
            return owner;
        }
        public String getName(){
            return name;
        }
        public Dog(Human owner, String name){
            this.name = name;
            this.owner = owner;
        }

        public void setOwner(){
            System.out.println("У " + owner.getName() + " есть " + getName());
        }
        public void put(Things thing){
            System.out.println(owner.getName() + " положил " + getName()
                    + " в " + thing.getName());
        }

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
