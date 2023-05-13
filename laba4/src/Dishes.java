public class Dishes extends kitchenThing {

    public Dishes (String name, String content){
        super(name, content);
    }

    private Features feature;

    public Features getFeatures(){
        return feature;
    }

    public void contFeatures(Features feature){
        this.feature = feature;
        System.out.println(getContent() + " " + this.feature.getFeatures());
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if( o == null || o.getClass() != getClass()) {
            return false;
        }
        Dishes check = (Dishes) o;
        return hashCode() == check.hashCode();
    }

}
