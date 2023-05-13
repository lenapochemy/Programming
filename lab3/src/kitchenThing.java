public abstract class kitchenThing implements INamable, IContain{

    private final String name;
    private String content;

    public kitchenThing(String name, String content){
        this.name = name;
        this.content = content;
    }

    public String getName(){
        return name;
    }

    public String getContent(){
        return content;
    }


    @Override
    public String toString() {
        return "name: " + name;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + content.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()){
            return false;
        }
        kitchenThing check = (kitchenThing) o;
        return hashCode() == check.hashCode();
    }
}
