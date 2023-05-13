public abstract class Entity implements INamable{
    private final String name;

    public Entity(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()){
            return false;
        }
        Entity check = (Entity) o;
        return hashCode() == check.hashCode();
    }

}
